<%@page import="model.Cliente"%>
<%@page import="model.DAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de clientes</title>
    </head>
    <body>
        <h1>Cadastro para cliente</h1>
        <%
            //instancia do obj
            Cliente cliente = new Cliente();
            
            // atribuindo valores ao obj
            cliente.setNome(request.getParameter("nome"));
            cliente.setCpf(request.getParameter("cpf"));
            cliente.setEmail(request.getParameter("email"));
            cliente.setTipo_moradia(request.getParameter("tipoMoradia"));
            cliente.setCep(request.getParameter("cep"));
            cliente.setNum_tel(request.getParameter("cel"));
            
            //Cadastro
            ClienteDAO clienteDAO = new ClienteDAO();
            if (clienteDAO.cadastrar(cliente)){
                out.println("Cliente cadastrado com sucesso!");
                //Saída
                out.println("<br><br> <b>Nome.......: </b>" + cliente.getNome());
                out.println("<br> <b>Email..........: </b>" + cliente.getEmail());
                out.println("<br> <b>CEP............: </b>" + cliente.getCep());
                out.println("<br> <b>CPF............: </b>" + cliente.getCpf());
                out.println("<br> <b>Celular........: </b>" + cliente.getNum_tel());
                out.println("<br> <b>Tipo de Moradia: </b>" + cliente.getTipo_moradia());
            }else{
                out.println("Produto não inserido!");
            }
        %>
    </body>
</html>

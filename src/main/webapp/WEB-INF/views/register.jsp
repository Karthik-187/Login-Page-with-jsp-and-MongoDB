<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register - Inventory Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #1e3c72 0%, #2a5298 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 20px;
        }
        .card {
            background: rgba(255, 255, 255, 0.9);
            backdrop-filter: blur(10px);
            border: none;
            border-radius: 20px;
            box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
            overflow: hidden;
            width: 100%;
            max-width: 400px;
        }
        .card-header {
            background: linear-gradient(45deg, #1a237e, #0d47a1);
            color: white;
            text-align: center;
            padding: 2rem;
            position: relative;
        }
        .card-header::after {
            content: '';
            position: absolute;
            bottom: -10px;
            left: 50%;
            transform: translateX(-50%);
            width: 50px;
            height: 10px;
            background: white;
            border-radius: 50%;
            box-shadow: 0 0 10px rgba(0,0,0,0.2);
        }
        .register-title {
            font-size: 2rem;
            font-weight: 700;
            margin: 0;
            text-shadow: 2px 2px 4px rgba(0,0,0,0.2);
        }
        .card-body {
            padding: 2rem;
        }
        .form-control {
            border-radius: 10px;
            padding: 12px 20px;
            border: 2px solid #e0e0e0;
            transition: all 0.3s;
            background: rgba(255, 255, 255, 0.9);
        }
        .form-control:focus {
            border-color: #1a237e;
            box-shadow: 0 0 15px rgba(26, 35, 126, 0.2);
        }
        .form-group {
            position: relative;
            margin-bottom: 1.5rem;
        }
        .form-group i {
            position: absolute;
            right: 15px;
            top: 50%;
            transform: translateY(-50%);
            color: #1a237e;
        }
        .btn-register {
            background: linear-gradient(45deg, #1a237e, #0d47a1);
            border: none;
            border-radius: 10px;
            padding: 12px;
            font-weight: 600;
            width: 100%;
            color: white;
            text-transform: uppercase;
            letter-spacing: 1px;
            transition: all 0.3s;
        }
        .btn-register:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(26, 35, 126, 0.4);
        }
        .login-link {
            text-align: center;
            margin-top: 1.5rem;
        }
        .login-link a {
            color: #1a237e;
            text-decoration: none;
            font-weight: 600;
            transition: all 0.3s;
        }
        .login-link a:hover {
            color: #0d47a1;
            text-decoration: underline;
        }
        .alert {
            border-radius: 10px;
            margin-bottom: 1.5rem;
        }
    </style>
</head>
<body>
    <div class="card">
        <div class="card-header">
            <h2 class="register-title">Create Account</h2>
            <p class="text-light mb-0">Join our community today</p>
        </div>
        <div class="card-body">
            <% if(request.getAttribute("error") != null) { %>
                <div class="alert alert-danger">
                    <i class="fas fa-exclamation-circle me-2"></i>
                    <%= request.getAttribute("error") %>
                </div>
            <% } %>
            <form action="register" method="POST">
                <div class="form-group">
                    <input type="text" class="form-control" id="username" name="username" 
                           placeholder="Username" required>
                    <i class="fas fa-user"></i>
                </div>
                <div class="form-group">
                    <input type="email" class="form-control" id="email" name="email" 
                           placeholder="Email Address" required>
                    <i class="fas fa-envelope"></i>
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="password" name="password" 
                           placeholder="Password" required>
                    <i class="fas fa-lock"></i>
                </div>
                <button type="submit" class="btn btn-register">
                    <i class="fas fa-user-plus me-2"></i> Create Account
                </button>
            </form>
            <div class="login-link">
                <p>Already have an account? <a href="login">Sign In</a></p>
            </div>
        </div>
    </div>
</body>
</html> 
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("HOLA");
	}

	@GetMapping("/hola")
	public String home() {
		return "Bienvenido";
	}

	@GetMapping("/adios")
	public String adios() {
		return "ADIOS";
	}

	@GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
	public String html() {
		String html = """
			<!doctype html>
			<html lang="es">
			<head>
			  <meta charset="utf-8">
			  <meta name="viewport" content="width=device-width,initial-scale=1">
			  <title>Bienvenido</title>
			  <style>
				:root{
				  --bg: #0f172a;
				  --card: #0b1220;
				  --accent: #7c3aed;
				  --muted: #94a3b8;
				  --glass: rgba(255,255,255,0.03);
				}
				html,body{height:100%;margin:0;font-family:Inter,ui-sans-serif,system-ui,Segoe UI,Roboto,"Helvetica Neue",Arial;}
				body{
				  background: linear-gradient(180deg, #021024 0%, #04132b 100%);
				  color: #e6eef8;
				  display:flex;
				  align-items:center;
				  justify-content:center;
				  padding:24px;
				}
				.card{
				  width:100%;
				  max-width:760px;
				  background: linear-gradient(180deg,var(--glass), rgba(255,255,255,0.02));
				  border: 1px solid rgba(255,255,255,0.04);
				  box-shadow: 0 10px 30px rgba(2,6,23,0.6);
				  border-radius:16px;
				  padding:28px;
				  backdrop-filter: blur(6px);
				}
				h1{
				  margin:0 0 8px 0;
				  font-size:28px;
				  letter-spacing: -0.5px;
				  color: #ffffff;
				}
				p.lead{
				  margin:0 0 16px 0;
				  color: var(--muted);
				}
				.meta{
				  display:flex;
				  gap:12px;
				  flex-wrap:wrap;
				  margin-top:18px;
				}
				.chip{
				  background: rgba(255,255,255,0.03);
				  padding:8px 12px;
				  border-radius:999px;
				  font-size:13px;
				  color: #dbeafe;
				  border: 1px solid rgba(255,255,255,0.02);
				}
				.cta{
				  display:inline-block;
				  margin-top:18px;
				  padding:10px 16px;
				  border-radius:10px;
				  text-decoration:none;
				  font-weight:600;
				  background: linear-gradient(90deg,var(--accent), #4f46e5);
				  color:white;
				  box-shadow: 0 6px 18px rgba(124,58,237,0.18);
				}
				footer{margin-top:18px;color:var(--muted);font-size:13px;}
				@media (max-width:520px){
				  .card{padding:18px;border-radius:12px;}
				  h1{font-size:22px;}
				}
			  </style>
			</head>
			<body>
			  <main class="card" role="main" aria-labelledby="title">
				<h1 id="title">¡Bienvenido a tu aplicación Spring Boot!</h1>
				<p class="lead">Este es un HTML de bienvenida simple que puedes devolver directamente desde un endpoint como respuesta HTML.</p>

				<div class="meta" role="list">
				  <div class="chip" role="listitem">Spring Boot</div>
				  <div class="chip" role="listitem">Java 21+</div>
				  <div class="chip" role="listitem">Endpoint: <code>/html</code></div>
				</div>

				<a class="cta" href="/swagger-ui.html" aria-label="Abrir documentación">Ver documentación</a>

				<footer>
				  <small>Hecho con ❤️ — &copy; %d</small>
				</footer>
			  </main>
			</body>
			</html>
			""".formatted(java.time.Year.now().getValue());
		return html;
	}
}

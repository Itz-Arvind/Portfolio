package com.portfolio.controller;

import com.portfolio.model.Certificate;
import com.portfolio.model.Experience;
import com.portfolio.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Arvind Dhakad");
        model.addAttribute("subtitle", "Software Developer · AI Enthusiast · Problem Solver");
        model.addAttribute("intro", "Results-driven software developer with a strong foundation in full-stack development and AI-based solutions. Passionate about turning ideas into functional products.");
        model.addAttribute("status", "Currently open to internships & opportunities");
        model.addAttribute("location", "Indore / Remote · UTC+5:30");
        model.addAttribute("education", "B.Tech CSE · 2023–2027");
        model.addAttribute("languages", "English (Fluent), Hindi (Native)");
        model.addAttribute("contactEmail", "arvinddhakad078@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/arvind-dhakad/");
        model.addAttribute("github", "https://github.com/Itz-Arvind");
        model.addAttribute("resumeLink", "/resume/resume.pdf");

        model.addAttribute("skills", List.of(
                new String[]{"Java", "Expert · 1-2 yrs", "85"},
                new String[]{"Springboot", "Expert · 1 yr", "75"},
                new String[]{"JavaScript", "Intermediate · 1-2 yrs", "65"},
                new String[]{"Python", "Beginner · 6 mo", "35"},
                new String[]{"AI / ML", "Growing", "60"},
                new String[]{"HTML/CSS", "Strong · 2 yrs", "80"}
        ));

        model.addAttribute("projects", List.of(
                new Project("Car Rental Website", "Dynamic car rental platform that allows users to browse and rent cars based on availability and dates.", "HTML · Flask · Python", "https://github.com/Itzudii/Car-Rental-Website-Flask-python")
                // new Project("CortexFS", "AI-enhanced file indexing and semantic search engine powered by local LLMs.", "Python · AI", "https://github.com/Itzudii/CortexFS"),
                // new Project("NEAT Flappy Bird", "AI agent that learns to play Flappy Bird using the NEAT neuroevolution algorithm.", "Python · Pygame · NEAT", "https://github.com/Itzudii/NEAT-Flappy-Bird"),
                // new Project("Stock Prediction — LSTM", "Published research on predicting stock prices using deep learning and LSTM neural networks.", "Python · ML · LSTM", "http://www.jetir.org/view?paper=JETIR2407370"),
                // new Project("JSnake — Game Dev Kit", "JS-based 2D game development library for building web games with Canvas. Copyright registered.", "JavaScript · Canvas", "https://github.com/Itzudii")
        ));

        model.addAttribute("experiences", List.of(
                // new Experience("Dec 2025", "Full Stack Developer", "Eduskills Academy", "Worked on Python projects building scalable web applications and REST APIs with Flask.", List.of("Python", "Flask", "APIs")),
                // new Experience("Jul 2025", "Python Developer", "CodeAlpha", "Built Flask web applications and web services during internship program.", List.of("Python", "Flask")),
                new Experience("2023–Present", "Student Developer", "Self Projects", "Multiple academic and personal projects in AI and web development — from LSTM stock prediction to a copyright-registered JS game library.", List.of("Python", "JavaScript", "AI/ML"))
        ));

        model.addAttribute("certificates", List.of(
                new Certificate("Claude with the Anthropic API", "Anthropic", "May 2026", "/certs/Certificate(Claude_API).pdf"),
                new Certificate("AWS Solutions Architect Associate Workshop", "Sage University Indore", "September 2024", "/certs/Certificate(AWS_Cloud).pdf"),
                new Certificate("Python Programming", "Sage University Indore", "May 2024", "/certs/Certificate(Python).pdf"),
                new Certificate("Java Programming", "Sage University Indore", "May 2024", "/certs/Certificate(Java).pdf")
                
                // new Certificate("India AI Impact Buildathon", "AI Impact Summit", "Feb 2026", "/certs/Certificate(india_AI_Impact_buildathon).pdf"),
                // new Certificate("Model Context Protocol: Advanced", "Anthropic", "March 2026", "/certs/Certificate(Model_Context_Protocol)Adv.pdf"),
                // new Certificate("AI & ML on Google Cloud", "Google Cloud", "Sep 2024", "/certs/Certificate(Introduction_to_AI&ML_on_google_cloud).pdf"),
                // new Certificate("JSnake Game Development Kit", "Intellectual Property India", "Oct 2025", "/certs/Copyright ROC(JS Based Game Development Kit).pdf"),
                // new Certificate("Stock Prediction Using ML & LSTM", "JETIR", "July 2024", "/certs/Research_Paper(Stock_Prediction_Using_ML&LSTM).pdf"),
                // new Certificate("Python Full Stack Developer Internship", "Eduskills Academy", "Dec 2025", "/certs/internship(Python_Fullstack_Developer).pdf"),
                // new Certificate("Python Developer Internship", "CodeAlpha", "July 2025", "/certs/Internship(code_alpha).pdf"),
                // new Certificate("AWS Workshop", "Sage University", "Sep 2024", "/certs/Certificate(AWS).pdf")
        ));

        return "index";
    }
}

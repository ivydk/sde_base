package edu.hz;

import edu.hz.io.*;

public class Main {

    public static void main(String[] args) {

        // define
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        // execute
        writer.writeLine("What is your role?");

        String role = reader.readLine();

        String answer = "The HZ offers a broad portfolio of programmes and applied research.\n" +
                "The HZ - as the personal University of Applied Sciences - offers students and\n" +
                "employees a personal and interdisciplinary development route and optimal guidance.\n" +
                "The HZ stands for Life Long Development. This means that we strive to allow\n" +
                "everyone to achieve maximum development of their talents, regardless of their age,\n" +
                "experience, or role in society.\n" +
                "The HZ offers its students innovative, market-oriented and personal higher\n" +
                "professional education and applied research. The HZ trains the professionals of\n" +
                "the future through continuous dialogue with the professional field. In collaboration\n" +
                "with the field, demand-based work takes place on the innovation of education and\n" +
                "research.\n" +
                "The education and research at the HZ are characterised by: professional relevance,\n" +
                "responding to the demand from the market, options fitting the ambitions of students\n" +
                "and economic profitability. The build-up of our education enables students to take\n" +
                "different pathways to achieve qualifications for the employment market (courses,\n" +
                "Associate degrees programmes, bachelor and master programmes). On the other\n" +
                "hand, this modularity offers the HZ the possibilities to respond to the changing\n" +
                "demands of the market more rapidly.\n" +
                "Our small scale allows us to respond to the job market of tomorrow rapidly and\n" +
                "personally";

        switch(role) {
            case "bachelor":
                writer.writeLine(answer);
                break;
            case "undergraduate":
                writer.writeLine(answer.replaceAll(",", "."));
                break;
            case "parent":
                writer.writeLine(answer.replaceAll("\\.", ". Be informed that"));
                break;
            default:
                writer.writeLine("this is not a valid role");
                break;
        }

    }
}

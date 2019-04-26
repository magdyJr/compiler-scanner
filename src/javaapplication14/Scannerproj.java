/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author amr magdi
 */
public class Scannerproj {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
        boolean brr = false;
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\amr\\projects\\JavaApplication14\\src\\javaapplication14\\tiny_sample_code.txt"));
            PrintWriter out = new PrintWriter("C:\\amr\\projects\\JavaApplication14\\src\\javaapplication14\\scanner_output.txt");
            PrintWriter out2 = new PrintWriter("C:\\amr\\projects\\JavaApplication14\\src\\javaapplication14\\parser_input.txt");
            String[] intxt = new String[100];
            String txt;
            String[] outtxt = new String[100];
            int x = 0, z = 0;
           

            while ((intxt[x] = br.readLine()) != null) {

                String[] parts = intxt[x].split("");
                for (int i = 0; i < parts.length; i++) {
                    if (!brr) {
                        if (parts[i].equalsIgnoreCase("i")) {
                            if (parts[i + 1].equalsIgnoreCase("f")) {
                                outtxt[z] = "if : reserved";
                                z++;
                                i++;
                                out2.print("if ");
                            } else {
                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                            }

                        } else if (parts[i].equalsIgnoreCase("t")) {
                            if (parts[i + 1].equalsIgnoreCase("h")) {
                                if (parts[i + 2].equalsIgnoreCase("e")) {
                                    if (parts[i + 3].equalsIgnoreCase("n")) {
                                        outtxt[z] = "then : reserved";
                                        out2.print("then ");
                                        z++;
                                        i = i + 3;

                                    } else {
                                        outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                    }
                                } else {
                                    outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                }
                            } else {
                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                            }
                        } else if (parts[i].equalsIgnoreCase("e")) {
                            if (parts[i + 1].equalsIgnoreCase("l")) {
                                if (parts[i + 2].equalsIgnoreCase("s")) {
                                    if (parts[i + 3].equalsIgnoreCase("e")) {
                                        outtxt[z] = "else : reserved";
                                        out2.print("else ");
                                        z++;
                                        i = i + 3;

                                    } else {
                                        outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                    }
                                } else {
                                    outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                }
                            } else if (parts[i + 1].equalsIgnoreCase("n")) {
                                if (parts[i + 2].equalsIgnoreCase("d")) {
                                    outtxt[z] = "end : reserved";
                                    out2.print("end ");
                                    z++;
                                    i = i + 2;
                                } else {
                                    outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                }
                            } else {
                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                            }
                        } else if (parts[i].equalsIgnoreCase("r")) {
                            if (parts[i + 1].equalsIgnoreCase("e")) {
                                if (parts[i + 2].equalsIgnoreCase("p")) {
                                    if (parts[i + 3].equalsIgnoreCase("e")) {
                                        if (parts[i + 4].equalsIgnoreCase("a")) {
                                            if (parts[i + 5].equalsIgnoreCase("t")) {
                                                outtxt[z] = "repeat : reserved";
                                                out2.print("repeat ");
                                                z++;
                                                i = i + 5;

                                            } else {
                                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                            }

                                        } else {
                                            outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                        }

                                    } else {
                                        outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                    }
                                } else if (parts[i + 2].equalsIgnoreCase("a")) {
                                    if (parts[i + 3].equalsIgnoreCase("d")) {
                                        outtxt[z] = "read : reserved";
                                        out2.print("read ");
                                        z++;
                                        i = i + 3;

                                    } else {
                                        outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                    }

                                } else {
                                    outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                }
                            } else {
                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                            }
                        } else if (parts[i].equalsIgnoreCase("u")) {
                            if (parts[i + 1].equalsIgnoreCase("n")) {
                                if (parts[i + 2].equalsIgnoreCase("t")) {
                                    if (parts[i + 3].equalsIgnoreCase("i")) {
                                        if (parts[i + 4].equalsIgnoreCase("l")) {
                                            outtxt[z] = "until : reserved";
                                            out2.print("until ");
                                            z++;
                                            i = i + 4;

                                        } else {
                                            outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                        }

                                    } else {
                                        outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                    }
                                } else {
                                    outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                }
                            } else {
                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                            }
                        } else if (parts[i].equalsIgnoreCase("w")) {
                            if (parts[i + 1].equalsIgnoreCase("r")) {
                                if (parts[i + 2].equalsIgnoreCase("i")) {
                                    if (parts[i + 3].equalsIgnoreCase("t")) {
                                        if (parts[i + 4].equalsIgnoreCase("e")) {
                                            outtxt[z] = "write : reserved";
                                            out2.print("write ");
                                            z++;
                                            i = i + 4;

                                        } else {
                                            outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                        }

                                    } else {
                                        outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                    }
                                } else {
                                    outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                                }
                            } else {
                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                            }
                        } else if (parts[i].equalsIgnoreCase("+")) {
                            outtxt[z] = "+ : special symbol";
                            out2.print("+ ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase("-")) {
                            outtxt[z] = "- : special symbol";
                            out2.print("- ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase("*")) {
                            outtxt[z] = "* : special symbol";
                            out2.print("* ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase("/")) {
                            outtxt[z] = "/ : special symbol";
                            out2.print("/ ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase("=")) {
                            outtxt[z] = "= : special symbol";
                            out2.print("= ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase("<")) {
                            outtxt[z] = "< : special symbol";
                            out2.print("< ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase(">")) {
                            outtxt[z] = "> : special symbol";
                            out2.print("> ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase("(")) {
                            outtxt[z] = "( : special symbol";
                            out2.print("( ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase(")")) {
                            outtxt[z] = ") : special symbol";
                            out2.print(") ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase(";")) {
                            outtxt[z] = "; : special symbol";
                            out2.print("; ");
                            z++;
                        } else if (parts[i].equalsIgnoreCase(":")) {
                            outtxt[z] = ": : special symbol";
                            out2.print(": ");
                            z++;
                        } else if (!parts[i].equalsIgnoreCase(" ")) {
                            if (parts[i].equalsIgnoreCase("0") | parts[i].equalsIgnoreCase("1") | parts[i].equalsIgnoreCase("2") | parts[i].equalsIgnoreCase("3") | parts[i].equalsIgnoreCase("4") | parts[i].equalsIgnoreCase("5") | parts[i].equalsIgnoreCase("6") | parts[i].equalsIgnoreCase("7") | parts[i].equalsIgnoreCase("8") | parts[i].equalsIgnoreCase("9")) {
                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (parts[ii].equalsIgnoreCase("0") | parts[ii].equalsIgnoreCase("1") | parts[ii].equalsIgnoreCase("2") | parts[ii].equalsIgnoreCase("3") | parts[ii].equalsIgnoreCase("4") | parts[ii].equalsIgnoreCase("5") | parts[ii].equalsIgnoreCase("6") | parts[ii].equalsIgnoreCase("7") | parts[ii].equalsIgnoreCase("8") | parts[ii].equalsIgnoreCase("9")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : number";
                                out2.print("number ");
                                z++;

                            } else if (parts[i].equalsIgnoreCase("{")) {
                                for (int ii = i + 1; ii < parts.length; ii++) {
                                    if (parts[ii].equalsIgnoreCase("}")) {
                                        i = ii;
                                        brr = false;
                                    } else {
                                        brr = true;
                                    }
                                }
                            } else if (!parts[i].isEmpty()) {
                                outtxt[z] = parts[i];
                                label1:
                                {
                                    for (int ii = i + 1; ii < parts.length; ii++) {

                                        if (!parts[ii].equalsIgnoreCase("+") & !parts[ii].equalsIgnoreCase(" ") & !parts[ii].equalsIgnoreCase("-") & !parts[ii].equalsIgnoreCase("*") & !parts[ii].equalsIgnoreCase("/") & !parts[ii].equalsIgnoreCase("=") & !parts[ii].equalsIgnoreCase("<") & !parts[ii].equalsIgnoreCase("(") & !parts[ii].equalsIgnoreCase(")") & !parts[ii].equalsIgnoreCase(";") & !parts[ii].equalsIgnoreCase(":")) {
                                            outtxt[z] = outtxt[z] + parts[ii];
                                            i = ii;

                                        } else {
                                            break label1;
                                        }
                                    }

                                }
                                outtxt[z] = outtxt[z] + " : identifier";
                                out2.print("identifier ");
                                z++;
                            }
                        }
                    } else {
                        label1:
                        {
                            for (int ii = i; ii < parts.length; ii++) {
                                if (parts[ii].equalsIgnoreCase("}")) {
                                    i = ii;
                                    brr = false;
                                    break label1;
                                } else {
                                    brr = true;
                                }
                            }
                        }
                    }
                }
                x++;
                out2.println();
            }
            for (int i = 0; i < z + 1; i++) {
                out.println(outtxt[i]);
            }
            br.close();
            out.close();
            out2.close();
        } catch (Exception e) {
            System.out.println("cant open the file !!");
        }
        

    }

}

package PACKAGE1;


import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.io.*;


public class Display extends Canvas implements Runnable, ActionListener, TableModelListener {

    public static int money =300000;


    @Override
    public void run() {
        long lastTime=System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns=1000000000.0 / 144;
        double delta=0;
        int frames=0;

        while (running){
            long now=System.nanoTime();
            delta+=(now-lastTime)/ns;
            lastTime=now;
            while(delta >= 1){
                update();
                delta--;
            }
            render();
            frames++;
            if(System.currentTimeMillis()-timer >1000){
                timer+=1000;
                this.frame.setTitle(title +" |"+frames+" fps");
                frames=0;
            }
        }
        stop();
    }
    int count1=0;
    int count2=0;
    int count3=0;
    int count4=0;
    int count5=0;
    int count6=0;
    int count7=0;
    public void customFrame(JFrame frame){
        JLabel background = new JLabel(new ImageIcon("need-for-speed-run-car-street-building-wallpaper.jpg"));
        background.setBounds(0,0, 1280, 720);
        background.setOpaque(true);
        CarModel carModel =new CarModel();
        carModel.setBounds(0,136,600,400);
        JProgressBar topSpeed =new JProgressBar();
        topSpeed.setValue(65);
        topSpeed.setBounds(880, 30, 300, 30);
        JProgressBar acceleration =new JProgressBar();
        acceleration.setBounds(880, 80, 300, 30);
        acceleration.setValue(70);
        JProgressBar handling =new JProgressBar();
        handling.setBounds(880, 130, 300, 30);
        handling.setValue(65);
        JLabel a1=new JLabel("Top Speed");
        a1.setBounds(770, 30, 80, 30);
        a1.setOpaque(true);
        a1.setBackground(Color.YELLOW);

        JLabel a2=new JLabel("Acceleration");
        a2.setBounds(770, 80, 80, 30);
        a2.setOpaque(true);
        a2.setBackground(Color.YELLOW);

        JLabel a3=new JLabel("Handling");
        a3.setBounds(770, 130, 80, 30);
        a3.setOpaque(true);
        a3.setBackground(Color.YELLOW);

        JLabel jlabel =new JLabel(new ImageIcon("audiLogo2.png"));
        jlabel.setOpaque(true);
        jlabel.setBackground(Color.DARK_GRAY);
        jlabel.setBounds(0, 0, 220, 136);

        JLabel displayMoney=new JLabel("Money: " + money);
        displayMoney.setBounds(400, 0, 200, 40);
        displayMoney.setBackground(Color.ORANGE);
        displayMoney.setOpaque(true);
        frame.add(displayMoney);



        Object[] columnNames={"Name of the data", "Data"};

        Object[][] data ={{"Lenght (cm)", audi.getLenght()},
                {"Width (cm)", audi.getWidht()},
                {"Weight (kg)", audi.getWeight()},
                {"Horse Power", audi.getEngine().getHorsePower()},
                {"Top Speed (km/h)", audi.getEngine().getTopSpeed()},
                {"Traction", audi.getEngine().getTraction()},
                {"Model", audi.getModel()},
                {"Year of Fabrication", audi.getYearOfFabrication()}};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        table.setFillsViewportHeight(true);
        table.setEnabled(false);
        JScrollPane scrollPane =new JScrollPane(table);
        table.setBounds(30,300, 300, 300);
        scrollPane.setBounds(900, 300, 300, 180);
        table.setVisible(true);

        table.setLayout(new FlowLayout());

        JButton engine = new JButton("Engine upgrades");
        engine.setBounds(0, 620, 183, 100);
        engine.setBackground(Color.red);
        engine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="Engine upgrades")
                    if(money >= 15000 && count1<3){
                        money=money-15000;
                        displayMoney.setText("Money: "+money);
                        topSpeed.setValue(topSpeed.getValue()+1);
                        acceleration.setValue(acceleration.getValue()+1);
                        count1++;
                    }
            }
        });

        frame.add(engine);

        JButton transmision = new JButton("Transmision upgrades");
        transmision.setBounds(184, 620, 183, 100);
        transmision.setBackground(Color.red);
        transmision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="Transmision upgrades")
                    if(money>=1500&& count2<3){
                    money=money-15000;
                    displayMoney.setText("Money: "+money);
                    topSpeed.setValue(topSpeed.getValue()+1);
                    count2++;
                }
            }
        });
        frame.add(transmision);


        JButton suspension = new JButton("Suspension upgrades");
        suspension.setBounds(368, 620, 183, 100);
        suspension.setBackground(Color.red);
        suspension.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="Suspension upgrades")
                    if(money>=1500&&count3<3){
                    money=money-15000;
                    displayMoney.setText("Money: "+money);
                    handling.setValue(handling.getValue()+2);
                    count3++;
                }
            }
        });
        frame.add(suspension);

        JButton nitrous = new JButton("Nitrous upgrades");
        nitrous.setBounds(552, 620, 183, 100);
        nitrous.setBackground(Color.red);
        nitrous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="Nitrous upgrades")
                    if(money>=1500&&count4<3){
                    money=money-15000;
                    displayMoney.setText("Money: "+money);
                    acceleration.setValue(acceleration.getValue()+1);
                    count4++;
                }
            }
        });
        frame.add(nitrous);

        JButton tires = new JButton("Tires upgrades");
        tires.setBounds(735, 620, 183, 100);
        tires.setBackground(Color.red);
        tires.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="Tires upgrades")
                    if(money>=1500&&count5<3){
                    money=money-15000;
                    displayMoney.setText("Money: "+money);
                    handling.setValue(handling.getValue()+1);
                    count5++;
                }
            }
        });
        frame.add(tires);

        JButton brakes = new JButton("Brakes upgrades");
        brakes.setBounds(919, 620, 183, 100);
        brakes.setBackground(Color.red);
        brakes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="Brakes upgrades")
                if(money>=1500&&count6<3){

                    money=money-15000;
                    displayMoney.setText("Money: "+money);
                    handling.setValue(handling.getValue()+1);
                    count6++;
                }
            }
        });
        frame.add(brakes);

        JButton play =new JButton("PLAY (in developing)");
        play.setBounds(650, 300, 200, 75);
        play.setBackground(Color.BLUE);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="PLAY (in developing)")
                    try {
                        Process p = Runtime.getRuntime().exec(new String[] {"Audi_java_project_2"});
                    } catch (IOException exception) {
                        // TODO Auto-generated catch block
                        exception.printStackTrace();
                    }
            }
        });
        frame.add(play);

        JButton turbo = new JButton("Turbo upgrades");
        turbo.setBounds(1103, 620, 183, 100);
        turbo.setBackground(Color.red);
        turbo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="Turbo upgrades")
                    if(money>=1500&&count7<3){
                    money=money-15000;
                    displayMoney.setText("Money: "+money);
                    topSpeed.setValue(topSpeed.getValue()+1);
                    acceleration.setValue(acceleration.getValue()+1);
                    count7++;

                }
            }
        });
        frame.add(turbo);
        frame.add(scrollPane);
        frame.add(jlabel);
        frame.add(a3);
        frame.add(a2);
        frame.add(a1);
        frame.add(handling);
        frame.add(acceleration);
        frame.add(topSpeed);
        frame.add(carModel);
        frame.add(background);

    }


    private void render(){
        BufferStrategy bs =this.getBufferStrategy();
        if(bs==null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g =bs.getDrawGraphics();
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0, WIDTH*2, HEIGHT*2);

        g.dispose();
        bs.show();
    }


    private Thread thread;
    private JFrame frame;
    private static String title="Garaj";
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static boolean running =false;
    private CarModel carModel;
    public Audi audi =new Audi(4427, 1940, 1645, 621, 321, "AWD", "Audi R8", 2017);
    public Engine engine=new Engine();

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JFrame getFrame() {
        return frame;
    }

    public Display() {
        this.frame= new JFrame();
        customFrame(this.frame);
        Dimension size = new Dimension(WIDTH, HEIGHT);
        this.setPreferredSize(size);

    }

    public synchronized void start(){
        running=true;
        this.thread=new Thread(this, title);
        this.thread.start();
    }

    public synchronized void stop(){
        running = false;
        try{
        this.thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



    private void update(){}


    public static void main(String[] args){
        String filepath ="BAD OMENS - Exit Wounds INSTRUMENTALCOVER (RAW files included) (online-audio-converter.com).wav";
        Music musicObject =new Music();
        musicObject.playMusic(filepath);

        Display display=new Display();
        display.frame.setTitle(title);
        display.frame.add(display);
        display.frame.pack();
        display.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.frame.setLocationRelativeTo(null);
        display.frame.setResizable(false);
        display.frame.setVisible(true);
        display.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {}

    @Override
    public void tableChanged(TableModelEvent e) {}


}

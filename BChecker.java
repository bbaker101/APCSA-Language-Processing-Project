import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BChecker {
    private JFrame frame;
    private JTextArea textArea;
    private JLabel counterLabel;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public BChecker() {
        frame = new JFrame("B Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
        frame.setUndecorated(true);
        frame.setVisible(false);

        JPanel panel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        //counterLabel = new JLabel("Number of 'b's: 0");
        //panel.add(counterLabel, BorderLayout.SOUTH);

        frame.add(panel);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                // if (Character.toLowerCase(e.getKeyChar()) == 'b') {
                //     bCount++;
                //     counterLabel.setText("Number of 'b's: " + bCount);
                // }

                String currentText = textArea.getText();
                
                // int bCount = 0;
                // for(int i = 0; i < currentText.length(); i++) {
                //     if(currentText.substring(i,i+1).equals("b")) {
                //         bCount++;
                //     }
                // }
                // counterLabel.setText("Number of 'b's: " + bCount);

            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BChecker();
    }


}

/**
 * [Intro: Snoop Dogg]
Greetings, loved ones
Let's take a journey

[Verse 1: Katy Perry, Snoop Dogg]
I know a place
Where the grass is really greener
Warm, wet, and wild
There must be somethin' in the water
Sippin' gin and juice
Layin' underneath the palm trees (Yeah, yeah, undone)
The boys break their necks
Tryna creep a little sneak peek (What? What? What? At us)

[Pre-Chorus: Katy Perry]
You could travel the world
But nothing comes close to the golden coast
Once you party with us
You'll be falling in love
Oh, oh-oh-oh-oh-oh-oh

[Chorus: Katy Perry, Snoop Dogg]
California girls, we're unforgettable
Daisy Dukes, bikinis on top
Sun-kissed skin so hot, we'll melt your popsicle
Oh-oh-oh-oh-oh-oh, oh, oh-oh-oh-oh-oh
California girls, we're undeniable
Fine, fresh, fierce, we got it on lock
West Coast represent, now put your hands up
Oh-oh-oh-oh-oh-oh, oh, oh-oh-oh-oh-oh (Ayy)
See Katy Perry Live
Get tickets as low as $74
You might also like
Noid
Tyler, The Creator
She Knows
J. Cole
The Day The Party Died
Kendrick Lamar
[Verse 2: Katy Perry]
Sex (Sex) on the beach
We don't mind sand in our stilettos
We freak in my Jeep
Snoop Doggy Dogg on the stereo, oh, oh

[Pre-Chorus: Katy Perry]
You could travel the world (You could travel the world)
But nothing comes close to the golden coast
Once you party with us (Once you party with us)
You'll be falling in love
Oh, oh-oh-oh-oh-oh-oh

[Chorus: Katy Perry, Snoop Dogg]
California girls, we're unforgettable (California)
Daisy Dukes, bikinis on top
Sun-kissed skin so hot, we'll melt your popsicle (Ooh)
Oh-oh-oh-oh-oh, oh, oh-oh-oh-oh-oh-oh
California girls (California), we're undeniable
Fine, fresh, fierce, we got it on lock
West Coast represent (West Coast), now put your hands up
Oh-oh-oh-oh-oh-oh, oh, oh-oh-oh-oh-oh

[Verse 3: Snoop Dogg, Katy Perry, Both]
Toned, tan, fit, and ready (Ready)
Turn it up 'cause it's gettin' heavy
Wild, wild, West Coast
These are the girls I love the most
I mean the ones, I mean like she's the one
Kiss her, touch her, squeeze her buns (Uh)
The girl's a freak
She drive a Jeep and live on the beach
I'm okay, I won't play
I love the Bay (Bay) just like I love L.A.​ (L.A.​)
Venice Beach and Palm Springs (Hey)
Summertime is everything
Homeboys bangin' out
All that ass hangin' out
Bikinis, zucchinis, martinis
No weenies, just the king and a queenie
Katy, my lady (Yeah?)
Look at here, baby (Uh-huh)
I'm all up on ya
'Cause you representin' California (Oh-oh, yeah)
[Chorus: Katy Perry, Snoop Dogg]
California girls, we're unforgettable
Daisy Dukes, bikinis on top (Wow, hey)
Sun-kissed skin so hot, we'll melt your popsicle
Oh-oh-oh-oh-oh-oh, oh, oh-oh-oh-oh-oh (Come on, come on, oh, oh, oh yeah)
California girls, we're undeniable (-Niable)
Fine, fresh, fierce, we got it on lock
West Coast represent (West Coast, West Coast)
Now put your hands up (Ayy, ayy)
Oh-oh-oh-oh-oh-oh, oh, oh-oh-oh-oh-oh

[Outro: Katy Perry, Snoop Dogg]
California
California girls (California girls, man)
California (Hahahaha)
California Girls
 */
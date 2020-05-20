package com.example.groupproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_moviedetail.*

class moviedetail : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    override fun onInitializationSuccess(provider: YouTubePlayer.Provider?, player: YouTubePlayer?, wasRestored: Boolean) {
        var title = intent.getStringExtra("title")
        if (!wasRestored) {
            if(title == "Jumanji"){
            player?.cueVideo("rBxcF-r9Ibs");
            }
            if(title == "Dora and the Lost City of Gold"){
                player?.cueVideo("gUTtJjV852c");
            }
            if(title == "The Jungle Book"){
                player?.cueVideo("5mkm22yO-bs");
            }
            if(title == "Tomb Raider"){
                player?.cueVideo("8ndhidEmUbI");
            }
            if(title == "Skyscraper"){
                player?.cueVideo("t9QePUT-Yt8");
            }
            if(title == "The Mummy"){
                player?.cueVideo("vJxgxVH0Fsk");
            }
            if(title == "Kong: Skull Island"){
                player?.cueVideo("44LdLqgOpjo");
            }
            if(title == "The Legend of Tarzan"){
                player?.cueVideo("Aj7ty6sViiU");
            }
            if(title == "Guardians of the Galaxy"){
                player?.cueVideo("d96cjJhvlMA");
            }
            //
            if(title == "Green Book"){
                player?.cueVideo("uC-_Gon2p9M");
            }
            if(title == "Wonder"){
                player?.cueVideo("Ob7fPOzbmzE");
            }
            if(title == "Parasite"){
                player?.cueVideo("5xH0HfJHsaY");
            }
            if(title == "Togo"){
                player?.cueVideo("IUOiouEIf2k");
            }
            if(title == "A Dog's Purpose"){
                player?.cueVideo("1jLOOCADTGs");
            }
            if(title == "The Shape of Water"){
                player?.cueVideo("XFYWazblaUA");
            }
            if(title =="A Street Cat Named Bob" ){
                player?.cueVideo("OUS--2gt1As");
            }
            if(title == "The Blind Side"){
                player?.cueVideo("I24d30buecw&t=22s");
            }
            if(title =="Fifty Shades Freed" ){
                player?.cueVideo("rNftKPy55gI");
            }
            //
            if(title == "Rampage"){
                player?.cueVideo("coOKvrsmQiI");
            }
            if(title == "The Fate of the Furious"){
                player?.cueVideo("jeKBMdYaM3U");
            }
            if(title == "Deadpool 2"){
                player?.cueVideo("20bpjtCbCz0-bs");
            }
            if(title == "Mission: Impossible – Fallout"){
                player?.cueVideo("XiHiW4N7-bo");
            }
            if(title =="Kingsman: The Golden Circle" ){
                player?.cueVideo("0fvqnGmr9S8");
            }
            if(title =="John Wick: Chapter 2" ){
                player?.cueVideo("XGk2EfbD_Ps");
            }
            if(title =="Now You See Me 2" ){
                player?.cueVideo("4I8rVcSQbic");
            }
            if(title == "Polar"){
                player?.cueVideo("oMHwRal-AR8");
            }
            if(title =="Wonder Woman" ){
                player?.cueVideo("1Q8fG0TtVAY");
            }
            ////
            if(title == "Me Before You"){
                player?.cueVideo("Eh993__rOxA");
            }
            if(title == "Crazy Rich Asians"){
                player?.cueVideo("ZQ-YX-5bAs0");
            }
            if(title == "Flipped"){
                player?.cueVideo("q40GxY5n2Dg");
            }
            if(title == "Beauty and the Beast"){
                player?.cueVideo("e3Nl_TCQXuw");
            }
            if(title == "The Age of Adaline"){
                player?.cueVideo("7UzSekc0LoQ");
            }
            if(title == "The Great Gatsby"){
                player?.cueVideo("rARN6agiW7o");
            }
            if(title =="Love, Rosie" ){
                player?.cueVideo("5zL3YJKygd4");
            }
            if(title =="The Terminal" ){
                player?.cueVideo("GZjC9dAvWuU");
            }
            if(title == "Becoming Jane"){
                player?.cueVideo("qmd-ej9Hx20");
            }
            ////
            if(title == "Venom"){
                player?.cueVideo("xLCn88bfW1o");
            }
            if(title == "Avengers: Infinity War"){
                player?.cueVideo("QwievZ1Tx-8");
            }
            if(title == "Alita: Battle Angel"){
                player?.cueVideo("w7pYhpJaJW8");
            }
            if(title == "Ready Player One"){
                player?.cueVideo("ixWL1BWi44U");
            }
            if(title == "Thor: Ragnarok"){
                player?.cueVideo("ue80QwXMRHg");
            }
            if(title == "Black Panther"){
                player?.cueVideo("F9cuSIlXt8");
            }
            if(title == "What Happened to Monday"){
                player?.cueVideo("5F-YEbm65a8");
            }
            if(title == "Pacific Rim Uprising"){
                player?.cueVideo("8BAhwgjMvnM");
            }
            if(title == "Transformers: The Last Knight"){
                player?.cueVideo("6Vtf0MszgP8");
            }
            //
            if(title == "Aquaman"){
                player?.cueVideo("2wcj6SrX4zw");
            }
            if(title == "Aladdin"){
                player?.cueVideo("foyufD52aog");
            }
            if(title =="Fantastic Beasts" ){
                player?.cueVideo("8bYBOVWLNIs");
            }
            if(title == "Mistress of Evil"){
                player?.cueVideo("5MwW1NAsnR8");
            }
            if(title =="The Last Witch Hunter" ){
                player?.cueVideo("66nnRrNydu0");
            }
            if(title == "Bright"){
                player?.cueVideo("MUY3GVByRUs");
            }
            if(title == "Underworld: Blood Wars"){
                player?.cueVideo("r6FxROAHJH4");
            }
            if(title =="Dracula Untold" ){
                player?.cueVideo("_2aWqecTTuE");
            }
            if(title =="The Huntsman" ){
                player?.cueVideo("eAvCgVR0gIM");
            }
            /////
            if(title == "2012"){
                player?.cueVideo("ce0N3TEcFw0");
            }
            if(title == "San Andreas"){
                player?.cueVideo("23VflsU3kZE");
            }
            if(title =="The Day After Tomorrow" ){
                player?.cueVideo("Ku_IseK3xTc");
            }
            if(title == "The Impossible"){
                player?.cueVideo("Bgw394ZKsis");
            }
            if(title =="Knowing" ){
                player?.cueVideo("C2zSFElhgE0");
            }
            if(title =="Geostorm" ){
                player?.cueVideo("RNmMRwjpfL0");
            }
            if(title == "Train to Busan"){
                player?.cueVideo("pyWuHv2-Abk");
            }
            if(title == "Crawl"){
                player?.cueVideo("H6MLJG0RdDE");
            }
            if(title == "Poseidon"){
                player?.cueVideo("wXvubYRnVWE");
            }
            //
            if(title == "The Intern"){
                player?.cueVideo("thv8myYCUQE");
            }
            if(title =="Pokémon Detective" ){
                player?.cueVideo("du88WArjb8w");
            }
            if(title =="Beverly Hills Chihuahua" ){
                player?.cueVideo("sXvSEVO1Heo");
            }
            if(title == "Kingsman"){
                player?.cueVideo("kl8F-8tR8to");
            }
            if(title == "Nine Lives"){
                player?.cueVideo("KCaCnK0MqJI");
            }
            if(title == "Peter Rabbit"){
                player?.cueVideo("7Pa_Weidt08");
            }
            if(title == "Game Night"){
                player?.cueVideo("fNtLIcyjsnI");
            }
            if(title == "Monster Trucks"){
                player?.cueVideo("trl1DNpFeyM");
            }
            if(title =="Paddington 2" ){
                player?.cueVideo("5B6A0UrYJsk");
            }
            ///
            if(title == "The Invisible Guest"){
                player?.cueVideo("epCg2RbyF80");
            }
            if(title =="Knives Out" ){
                player?.cueVideo("xi-1NchUqMA");
            }
            if(title == "Battle of Memories"){
                player?.cueVideo("N7QnN4BvlcM");
            }
            if(title == "A Simple Favor"){
                player?.cueVideo("rAqMlh0b2HU");
            }
            if(title == "The Good Liar"){
                player?.cueVideo("U2xDIe01fFY");
            }
            if(title =="At the End of the Tunnel" ){
                player?.cueVideo("fPc0SQyD-ac");
            }
            if(title == "Gogol. Viy"){
                player?.cueVideo("537rmn8EzII");
            }
            if(title == "The Limehouse Golem"){
                player?.cueVideo("P8EJAyk01kk");
            }
            if(title == "Crooked House"){
                player?.cueVideo("LGT9yjvApa0");
            }
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moviedetail)
        yt_pv.initialize("AIzaSyBlr2op1tDi8_yESR9VfI8I4tasaaFznBc", this)
    }
}




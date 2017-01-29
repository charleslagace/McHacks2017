package com.nuance.speechkitsample;


public class AnalyzeJava {
    // Skills
    String[] skillNames = {"Leadership",
            "Problem Solving",
            "Teamwork",
            "Interpersonal Skills",
            "Communication",
            "Self-awareness",
            "Willing to learn",
            "Initiative",
            "Planning",
            "Flexibility",
            "Numeracy",
            "Commitment"};
    double[] skillValues = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Leadership
    String[][][] skillKeywords = {{{"responsib", "0.4"},
            {"manag", "0.4"},
            {"organis", "0.7"},
            {"organiz", "0.7"},
            {"leader", "1.0"},
            {"energ", "0.3"},
            {"advocat", "0.8"},
            {"decid", "0.5"},
            {"decis", "0.7"},
            {"influen", "0.4"},
            {"motivating", "0.6"},
            {"inspiring", "0.5"}},
            {{"improve", "0.4"}, // Problem-solving
                    {"improving", "0.4"},
                    {"apply", "0.3"},
                    {"appli", "0.3"},
                    {"solv", "0.9"},
                    {"creativ", "0.8"},
                    {"inquir", "0.7"},
                    {"investig", "0.7"},
                    {"problem-solv", "1.0"},
                    {"rational", "0.6"},
                    {"scien", "0.6"},
                    {"analy", "0.9"}},
            {{"team", "0.7"}, // Teamwork
                    {"help", "0.5"},
                    {"support", "0.6"},
                    {"together", "0.5"},
                    {"group", "0.6"},
                    {"teamwork", "1.0"},
                    {"atmosphere", "0.7"},
                    {"cooperat", "0.9"},
                    {"collaborat", "0.8"},
                    {"foster", "0.5"},
                    {"cohesi", "0.6"},
                    {"close", "0.3"}},
            {{"opinion", "0.5"}, // Interpersonal Skills
                    {"suggestion", "0.4"},
                    {"deal with", "0.6"},
                    {"listen", "0.5"},
                    {"social", "0.9"},
                    {"relation", "0.8"},
                    {"advis", "0.7"},
                    {"counsellor", "0.8"},
                    {"collaborat", "0.8"},
                    {"accomodat", "0.5"},
                    {"tactful", "0.6"},
                    {"diplomat", "0.7"}},
            {{"communicat", "1.0"}, // Communication
                    {"present", "0.5"},
                    {"idea", "0.4"},
                    {"conversation", "0.9"},
                    {"persuad", "0.7"},
                    {"educat", "0.5"},
                    {"writ", "0.6"},
                    {"influenc", "0.7"},
                    {"promot", "0.6"},
                    {"contact", "0.8"},
                    {"express", "0.7"},
                    {"telling", "0.6"}},
            {{"reflect", "0.9"}, // Self-awareness
                    {"ability", "0.5"},
                    {"aware", "0.8"},
                    {"enlighten", "0.4"},
                    {"conscious", "0.8"},
                    {"mindful", "0.8"},
                    {"purpose", "0.6"},
                    {"focus", "0.5"},
                    {"realis", "0.4"},
                    {"informed", "0.6"},
                    {"self-aware", "1.0"},
                    {"aptitude", "0.4"}},
            {{"learn", "0.9"}, // Will to learn
                    {"read", "0.8"},
                    {"knowledge", "0.7"},
                    {"theory", "0.6"},
                    {"technique", "0.4"},
                    {"science", "0.7"},
                    {"eager", "0.5"},
                    {"curio", "0.8"},
                    {"intellect", "0.5"},
                    {"inquir", "0.6"},
                    {"investig", "0.8"},
                    {"enthusias", "0.6"}},
            {{"develop", "0.6"}, // Initiative
                    {"complet", "0.4"},
                    {"creat", "0.6"},
                    {"discover", "0.4"},
                    {"initiative", "1.0"},
                    {"invent", "0.7"},
                    {"proactiv", "0.8"},
                    {"enterpris", "0.7"},
                    {"ambitio", "0.8"},
                    {"opportun", "0.6"},
                    {"driven", "0.7"},
                    {"persist", "0.5"}},
            {{"plan", "0.9"}, // Planning
                    {"efficien", "0.6"},
                    {"deadline", "0.4"},
                    {"design", "0.5"},
                    {"detail", "0.5"},
                    {"elaborat", "0.7"},
                    {"organis", "0.8"},
                    {"organiz", "0.8"},
                    {"precis", "0.7"},
                    {"evaluat", "0.5"},
                    {"negotiat", "0.4"},
                    {"long-term", "0.6"}},
            {{"different", "0.3"}, // Flexibility
                    {"open", "0.2"},
                    {"divers", "0.7"},
                    {"vary", "0.6"},
                    {"flexib", "1.0"},
                    {"versatil", "0.8"},
                    {"adapt", "0.8"},
                    {"multi", "0.6"},
                    {"tolera", "0.6"},
                    {"indulge", "0.6"},
                    {"easygoing", "0.5"},
                    {"permi", "0.6"}},
            {{"number", "0.9"}, // Numeracy
                    {"comput", "0.9"},
                    {"calculat", "0.9"},
                    {"math", "0.8"},
                    {"accura", "0.7"},
                    {"analy", "0.7"},
                    {"detail", "0.5"},
                    {"numeric", "0.9"},
                    {"reasoning", "0.6"},
                    {"account", "0.5"},
                    {"measur", "0.5"},
                    {"determin", "0.4"}},
            {{"perform", "0.5"}, // Commitment
                    {"contribut", "0.7"},
                    {"hard work", "0.8"},
                    {"commit", "1.0"},
                    {"dedicat", "0.8"},
                    {"punctual", "0.4"},
                    {"reliab", "0.6"},
                    {"knowledge", "0.5"},
                    {"responsib", "0.7"},
                    {"engag", "0.8"},
                    {"diligen", "0.7"},
                    {"persever", "0.6"}}};

    // Feeling
    double feelingValue = 0.0;
    String[][] feelingKeywords = {{"memorable", "0.5"},
            {"comfortable", "0.6"},
            {"happy", "0.8"},
            {"fortunate", "0.4"},
            {"confiden", "0.6"},
            {"valuable", "0.5"},
            {"joy", "0.7"},
            {"glad", "0.8"},
            {"uplift", "0.9"},
            {"benefi", "0.5"},
            {"proud", "0.6"},
            {"amazing", "0.7"},
            {"important", "0.3"},
            {"uncertain", "-0.4"},
            {"overwhelm", "-0.6"},
            {"stress", "-0.5"},
            {"difficult", "-0.5"},
            {"uneas", "-0.6"},
            {"cheer", "0.6"},
            {"content", "0.3"},
            {"ecstatic", "0.8"},
            {"delight", "0.7"},
            {"pleasant", "0.5"},
            {"pleased", "0.5"},
            {"thrill", "0.6"},
            {"amus", "0.5"},
            {"admir", "0.6"},
            {"appreciat", "0.4"},
            {"awesome", "0.7"},
            {"dynami", "0.3"},
            {"eager", "0.6"},
            {"fantastic", "0.7"},
            {"gratif", "0.6"},
            {"honor", "0.6"},
            {"jubilan", "0.9"},
            {"kind", "0.5"},
            {"marvelous", "0.8"},
            {"motivat", "0.5"},
            {"marvellous", "0.8"},
            {"passion", "0.7"},
            {"perfect", "0.8"},
            {"positive", "0.5"},
            {"satisf", "0.4"},
            {"reward", "0.6"},
            {"purpose", "0.4"},
            {"vitali", "0.5"},
            {"respect", "0.4"},
            {"sensational", "0.8"},
            {"splendid", "0.7"},
            {"thank", "0.5"},
            {"unique", "0.5"},
            {"worth", "0.6"},
            {"afraid", "-0.4"},
            {"alarm", "-0.7"},
            {"anxious", "-0.8"},
            {"annoy", "-0.5"},
            {"anguish", "-0.8"},
            {"ambivalen", "-0.2"},
            {"lone", "-0.3"},
            {"arrogan", "-0.4"},
            {"awful", "-0.7"},
            {"awkward", "-0.6"},
            {"bad", "-0.5"},
            {"bitter", "-0.6"},
            {"bored", "-0.5"},
            {"boring", "-0.5"},
            {"chaotic", "-0.6"},
            {"competiti", "-0.4"},
            {"confus", "-0.5"},
            {"conflict", "-0.6"},
            {"cruel", "-0.9"},
            {"deception", "-0.6"},
            {"desper", "-0.8"},
            {"depriv", "-0.7"},
            {"depress", "-0.8"},
            {"disappoint", "-0.6"},
            {"devastat", "-0.8"},
            {"discourag", "-0.7"},
            {"disgust", "-0.7"},
            {"disturb", "-0.5"},
            {"doubt", "-0.4"},
            {"failure", "-0.6"},
            {"exhaust", "-0.5"},
            {"enrag", "-0.7"},
            {"fatigu", "-0.5"},
            {"frustra", "-0.7"},
            {"furious", "-0.7"},
            {"guilt", "-0.6"},
            {"hinder", "-0.5"},
            {"horrible", "-0.6"},
            {"insecure", "-0.6"},
            {"lack", "-0.5"},
            {"limit", "-0.4"},
            {"minim", "-0.4"},
            {"mistreated", "-0.8"},
            {"mock", "-0.6"},
            {"neglect", "-0.6"},
            {"nervous", "-0.7"},
            {"obnoxious", "-0.6"},
            {"offend", "-0.6"},
            {"oppress", "-0.7"},
            {"overwork", "-0.5"},
            {"perturb", "-0.4"},
            {"panick", "-0.6"},
            {"pressure", "-0.7"},
            {"punish", "-0.5"},
            {"reject", "-0.5"},
            {"regret", "-0.6"},
            {"resent", "-0.5"},
            {"restrain", "-0.6"},
            {"restrict", "-0.6"},
            {"sad", "-0.7"},
            {"shame", "-0.7"},
            {"suicid", "-1.0"},
            {"suffer", "-0.9"},
            {"stupid", "-0.4"},
            {"terrible", "-0.7"},
            {"threat", "-0.8"},
            {"timid", "-0.5"},
            {"tired", "-0.5"},
            {"trouble", "-0.6"},
            {"upset", "-0.6"},
            {"worried", "-0.6"},
            {"wrong", "-0.4"}};

    // Goals
    String[] goalNames = {"Job", "Internship", "Research", "Volunteering", "Exchange"};
    double[] goalValues = {0, 0, 0, 0, 0};
    String[][][] goalKeywords = {{{"job", "1.0"},
            {"position", "0.5"},
            {"career", "0.7"},
            {"work", "0.6"}
    },
            {{"internship", "1.0"},
                    {"position", "0.5"},
                    {"career", "0.3"},
                    {"work", "0.4"},
                    {"experience", "0.5"}
            },
            {{"research", "1.0"},
                    {"position", "0.5"},
                    {"work", "0.5"},
                    {"laboratory", "0.9"},
                    {"experience", "0.5"}
            },
            {{"volunteer", "1.0"},
                    {"position", "0.5"},
                    {"experience", "0.6"},
                    {"unpaid", "0.8"}
            },
            {{"exchange", "1.0"},
                    {"abroad", "1.0"},
                    {"elsewhere", "0.5"},
                    {"somewhere else", "0.5"}}};
    public void main(String text) {


        // Compute the skill values
        for (int i = 0; i < skillKeywords.length; i++) {
            for (int j = 0; j<skillKeywords[i].length; j++) {
                if (text.contains(skillKeywords[i][j][0])) {
                    skillValues[i] += Double.parseDouble(skillKeywords[i][j][1]);
                }
            }
        }
        // Compute the feeling value
        for (int i = 0; i < feelingKeywords.length; i++) {
            if (text.contains(feelingKeywords[i][0])) {
                feelingValue += Double.parseDouble(feelingKeywords[i][1]);
            }
        }
        // Compute the goal values
        for (int i = 0; i < goalKeywords.length; i++) {
            for (int j = 0; j<goalKeywords[i].length; j++) {
                if (text.contains(goalKeywords[i][j][0])) {
                    goalValues[i] += Double.parseDouble(goalKeywords[i][j][1]);
                }
            }
        }
    }
}
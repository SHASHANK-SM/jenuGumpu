package com.example.jenugumpu.ai

class GenAiAdvisor {

    fun buildBusinessAdvice(skill: String, location: String, budget: Int): String {
        val idea = when {
            skill.contains("tailor", ignoreCase = true) -> "custom stitching and repair service"
            skill.contains("food", ignoreCase = true) -> "home food and snack supply service"
            skill.contains("craft", ignoreCase = true) -> "local craft micro-brand"
            else -> "neighborhood service business"
        }

        return "Suggested idea: Start a $idea in $location. " +
            "Use Rs.$budget for raw material, sample products, and simple digital promotion. " +
            "Track daily orders, ask customers for repeat needs, and list products in the marketplace."
    }
}

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: String,
    val name: String,
    val email: String
)

@Serializable
data class Account(
    val id: String,
    val userId: String,
    val balance: Double
)

@Serializable
data class Category(
    val id: String,
    val name: String
)

@Serializable
data class Transaction(
    val id: String,
    val accountId: String,
    val categoryId: String,
    val amount: Double,
    val date: String
)

@Serializable
data class SavingsGoal(
    val id: String,
    val userId: String,
    val targetAmount: Double,
    val currentAmount: Double
)

@Serializable
data class Budget(
    val id: String,
    val userId: String,
    val amount: Double
)

@Serializable
data class RecurringRule(
    val id: String,
    val transactionId: String,
    val frequency: String
)

@Serializable
data class Attachment(
    val id: String,
    val transactionId: String,
    val filePath: String
)
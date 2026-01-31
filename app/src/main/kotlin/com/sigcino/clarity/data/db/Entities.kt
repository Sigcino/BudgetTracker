import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val email: String
)

@Entity(tableName = "accounts")
data class Account(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val userId: Long,
    val accountName: String,
    val balance: Double
)

@Entity(tableName = "categories")
data class Category(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val type: String
)

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val accountId: Long,
    val categoryId: Long,
    val amount: Double,
    val date: String
)

@Entity(tableName = "savings_goals")
data class SavingsGoal(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val userId: Long,
    val goalName: String,
    val targetAmount: Double,
    val currentAmount: Double
)

@Entity(tableName = "budgets")
data class Budget(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val userId: Long,
    val month: String,
    val year: Int,
    val totalBudget: Double
)

@Entity(tableName = "recurring_rules")
data class RecurringRule(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val transactionId: Long,
    val frequency: String,
    val nextOccurrence: String
)
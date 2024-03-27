board=[["","",""],["","",""],["","",""]]
def won(g):
    if g[2][0]==g[1][1]==g[1][2] and g[2][0]!="":
        return g[2][0],"wins"
    elif g[0][0]==g[1][1]==g[2][2] and g[0][0]!="":
        return g[0][0],"wins"
    for i in range(3):
        if g[i][0]==g[i][1]==g[i][2] and g[i][0]!="":
            return g[i][0],"wins"
        elif g[0][i]==g[1][i]==g[2][i] and g[0][i]!="":
            return g[0][i],"wins"
def game():
    players=["X","O"]
    present=0
    while True:
        xo = players[present]
        row=int(input("player "+xo+" enter the row:(0,1,2): "))
        col=int(input("player "+xo+" enter the column:(0,1,2): "))
        present=int(not(present))
        if board[row][col]=="":
            board[row][col] = xo
            print(won(board))
            if won(board):
                for i in board:
                    print(i)
                break
            else:
                for i in board:
                    print(i)
        else:
            print("already occupied")
            present=int(not(present))
        if (board[0][0]!='' and board[0][1]!= '' and board[0][2]!='' and board[1][0]!='' and board[1][1]!= '' and board[1][2]!='' and board[2][0]!='' and board[2][1]!= '' and board[2][2]!=''  ):
            print("it's a draw, play again.")
            break
print("lets play")
game()
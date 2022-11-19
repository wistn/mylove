/*
 * Author:wistn
 * since:2022-11-19
 * LastEditors:Do not edit
 * LastEditTime:2022-11-19
 * Description:
 */
#include <time.h>

int main()
{
    time_t now = time(0);
    while (difftime(time(0), now) < 60 * 3)
    {
        // with XiXi
        now = time(0);
    }
    return 0;
}

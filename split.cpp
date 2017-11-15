#include<bits/stdc++.h>
using namespace std;

int main()
{
    string url="http://qwert.mjgug.ouhnbg:5678/path1/path2.html";
    size_t found = url.find_first_of(":");
    string protocol=url.substr(0,found); //http

    string url_new=url.substr(found+3); //url_new is the url excluding the http part
    size_t found1 =url_new.find_first_of(":");
    string host =url_new.substr(0,found1);

    size_t found2 = url_new.find_first_of("/");
    string port =url_new.substr(found1+1,found2-found1-1);
    string path =url_new.substr(found2);

    cout<<protocol<<endl<<host<<endl<<port<<endl<<path;
    return 0;
 }

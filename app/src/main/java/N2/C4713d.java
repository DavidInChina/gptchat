package n2;

import Df.H;
import U3.u;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.E;
import androidx.lifecycle.d0;
import java.io.PrintWriter;

/* renamed from: n2.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4713d extends H {

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC2086v f39607f;

    /* renamed from: g  reason: collision with root package name */
    public final C4712c f39608g;

    public C4713d(AbstractC2086v abstractC2086v, d0 d0Var) {
        this.f39607f = abstractC2086v;
        this.f39608g = (C4712c) new u(d0Var, C4712c.f39604f).l(C4712c.class);
    }

    public final void F0(String str, PrintWriter printWriter) {
        boolean z10;
        C4712c c4712c = this.f39608g;
        if (c4712c.f39605d.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < c4712c.f39605d.f(); i10++) {
                C4710a c4710a = (C4710a) c4712c.f39605d.g(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c4712c.f39605d.d(i10));
                printWriter.print(": ");
                printWriter.println(c4710a.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(c4710a.f39594l);
                printWriter.print(" mArgs=");
                printWriter.println(c4710a.f39595m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(c4710a.f39596n);
                o2.b bVar = c4710a.f39596n;
                String str3 = str2 + "  ";
                bVar.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(bVar.f40512a);
                printWriter.print(" mListener=");
                printWriter.println(bVar.f40513b);
                if (bVar.f40514c || bVar.f40517f) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(bVar.f40514c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(bVar.f40517f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (bVar.f40515d || bVar.f40516e) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(bVar.f40515d);
                    printWriter.print(" mReset=");
                    printWriter.println(bVar.f40516e);
                }
                if (bVar.f40519h != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(bVar.f40519h);
                    printWriter.print(" waiting=");
                    bVar.f40519h.getClass();
                    printWriter.println(false);
                }
                if (bVar.f40520i != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(bVar.f40520i);
                    printWriter.print(" waiting=");
                    bVar.f40520i.getClass();
                    printWriter.println(false);
                }
                if (c4710a.f39598p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c4710a.f39598p);
                    C4711b c4711b = c4710a.f39598p;
                    c4711b.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c4711b.f39601Z);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                o2.b bVar2 = c4710a.f39596n;
                Object obj = c4710a.f25296e;
                if (obj == E.f25291k) {
                    obj = null;
                }
                bVar2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                if (obj == null) {
                    sb2.append("null");
                } else {
                    Class<?> cls = obj.getClass();
                    sb2.append(cls.getSimpleName());
                    sb2.append("{");
                    sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb2.append("}");
                }
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (c4710a.f25294c > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                printWriter.println(z10);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f39607f.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}

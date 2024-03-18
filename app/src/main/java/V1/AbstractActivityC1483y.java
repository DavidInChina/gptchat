package V1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.EnumC2082q;
import g.AbstractActivityC3122o;
import g.C3113f;
import g.C3114g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import n2.C4713d;
import o1.AbstractC4890e;
import o1.AbstractC4891f;

/* renamed from: V1.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1483y extends AbstractActivityC3122o implements AbstractC4890e, AbstractC4891f {

    /* renamed from: D0  reason: collision with root package name */
    public static final /* synthetic */ int f18313D0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f18314A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f18315B0;

    /* renamed from: y0  reason: collision with root package name */
    public final F4.a f18317y0 = new F4.a(18, new C1482x(this));

    /* renamed from: z0  reason: collision with root package name */
    public final C2088x f18318z0 = new C2088x(this);

    /* renamed from: C0  reason: collision with root package name */
    public boolean f18316C0 = true;

    public AbstractActivityC1483y() {
        this.f30969j0.f645b.c("android:support:lifecycle", new C3113f(2, this));
        this.f30977r0.add(new C1.a(this) { // from class: V1.w

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1483y f18307b;

            {
                this.f18307b = this;
            }

            @Override // C1.a
            public final void accept(Object obj) {
                int i10 = r2;
                AbstractActivityC1483y abstractActivityC1483y = this.f18307b;
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        abstractActivityC1483y.f18317y0.f();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        abstractActivityC1483y.f18317y0.f();
                        return;
                }
            }
        });
        this.f30979t0.add(new C1.a(this) { // from class: V1.w

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1483y f18307b;

            {
                this.f18307b = this;
            }

            @Override // C1.a
            public final void accept(Object obj) {
                int i10 = r2;
                AbstractActivityC1483y abstractActivityC1483y = this.f18307b;
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        abstractActivityC1483y.f18317y0.f();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        abstractActivityC1483y.f18317y0.f();
                        return;
                }
            }
        });
        j(new C3114g(this, 1));
    }

    public static boolean m(K k10) {
        AbstractActivityC1483y abstractActivityC1483y;
        EnumC2082q enumC2082q = EnumC2082q.f25377h0;
        boolean z10 = false;
        for (AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v : k10.f18046c.z()) {
            if (abstractComponentCallbacksC1480v != null) {
                C1482x c1482x = abstractComponentCallbacksC1480v.f18303x0;
                if (c1482x == null) {
                    abstractActivityC1483y = null;
                } else {
                    abstractActivityC1483y = c1482x.f18312j0;
                }
                if (abstractActivityC1483y != null) {
                    z10 |= m(abstractComponentCallbacksC1480v.l());
                }
                a0 a0Var = abstractComponentCallbacksC1480v.f18279T0;
                EnumC2082q enumC2082q2 = EnumC2082q.f25378i0;
                if (a0Var != null) {
                    a0Var.g();
                    if (a0Var.f18154j0.f25386f.a(enumC2082q2)) {
                        abstractComponentCallbacksC1480v.f18279T0.f18154j0.m(enumC2082q);
                        z10 = true;
                    }
                }
                if (abstractComponentCallbacksC1480v.f18278S0.f25386f.a(enumC2082q2)) {
                    abstractComponentCallbacksC1480v.f18278S0.m(enumC2082q);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L26;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        boolean z10 = false;
        if (strArr != null && strArr.length > 0) {
            String str2 = strArr[0];
            str2.getClass();
            char c10 = '\uffff';
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
            }
        }
        if (!(!z10)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f18314A0);
        printWriter.print(" mResumed=");
        printWriter.print(this.f18315B0);
        printWriter.print(" mStopped=");
        printWriter.print(this.f18316C0);
        if (getApplication() != null) {
            new C4713d(this, e()).F0(str3, printWriter);
        }
        this.f18317y0.e().u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f18317y0.f();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // g.AbstractActivityC3122o, o1.AbstractActivityC4898m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18318z0.k(EnumC2081p.ON_CREATE);
        K k10 = ((C1482x) this.f18317y0.f5033Z).f18311i0;
        k10.f18035F = false;
        k10.f18036G = false;
        k10.f18042M.f18084i = false;
        k10.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C1482x) this.f18317y0.f5033Z).f18311i0.f18049f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C1482x) this.f18317y0.f5033Z).f18311i0.k();
        this.f18318z0.k(EnumC2081p.ON_DESTROY);
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((C1482x) this.f18317y0.f5033Z).f18311i0.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f18315B0 = false;
        ((C1482x) this.f18317y0.f5033Z).f18311i0.t(5);
        this.f18318z0.k(EnumC2081p.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f18318z0.k(EnumC2081p.ON_RESUME);
        K k10 = ((C1482x) this.f18317y0.f5033Z).f18311i0;
        k10.f18035F = false;
        k10.f18036G = false;
        k10.f18042M.f18084i = false;
        k10.t(7);
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity, o1.AbstractC4890e
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f18317y0.f();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        F4.a aVar = this.f18317y0;
        aVar.f();
        super.onResume();
        this.f18315B0 = true;
        ((C1482x) aVar.f5033Z).f18311i0.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        F4.a aVar = this.f18317y0;
        aVar.f();
        super.onStart();
        this.f18316C0 = false;
        if (!this.f18314A0) {
            this.f18314A0 = true;
            K k10 = ((C1482x) aVar.f5033Z).f18311i0;
            k10.f18035F = false;
            k10.f18036G = false;
            k10.f18042M.f18084i = false;
            k10.t(4);
        }
        ((C1482x) aVar.f5033Z).f18311i0.y(true);
        this.f18318z0.k(EnumC2081p.ON_START);
        K k11 = ((C1482x) aVar.f5033Z).f18311i0;
        k11.f18035F = false;
        k11.f18036G = false;
        k11.f18042M.f18084i = false;
        k11.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f18317y0.f();
    }

    @Override // android.app.Activity
    public void onStop() {
        F4.a aVar;
        super.onStop();
        this.f18316C0 = true;
        do {
            aVar = this.f18317y0;
        } while (m(aVar.e()));
        K k10 = ((C1482x) aVar.f5033Z).f18311i0;
        k10.f18036G = true;
        k10.f18042M.f18084i = true;
        k10.t(4);
        this.f18318z0.k(EnumC2081p.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C1482x) this.f18317y0.f5033Z).f18311i0.f18049f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}

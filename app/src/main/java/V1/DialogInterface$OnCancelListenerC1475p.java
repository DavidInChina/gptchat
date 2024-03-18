package V1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c1.AbstractC2279d;
import g.DialogC3123p;
import g.RunnableC3118k;
import n.AbstractC4694e;
import q1.AbstractC5260f;

/* renamed from: V1.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC1475p extends AbstractComponentCallbacksC1480v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a1  reason: collision with root package name */
    public Handler f18226a1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f18233j1;

    /* renamed from: l1  reason: collision with root package name */
    public Dialog f18235l1;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f18236m1;

    /* renamed from: n1  reason: collision with root package name */
    public boolean f18237n1;

    /* renamed from: o1  reason: collision with root package name */
    public boolean f18238o1;
    public final RunnableC3118k b1 = new RunnableC3118k(7, this);

    /* renamed from: c1  reason: collision with root package name */
    public final DialogInterface$OnCancelListenerC1472m f18227c1 = new DialogInterface$OnCancelListenerC1472m(this, 0);

    /* renamed from: d1  reason: collision with root package name */
    public final DialogInterface$OnDismissListenerC1473n f18228d1 = new DialogInterface$OnDismissListenerC1473n(this);

    /* renamed from: e1  reason: collision with root package name */
    public int f18229e1 = 0;

    /* renamed from: f1  reason: collision with root package name */
    public int f18230f1 = 0;
    public boolean g1 = true;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f18231h1 = true;

    /* renamed from: i1  reason: collision with root package name */
    public int f18232i1 = -1;

    /* renamed from: k1  reason: collision with root package name */
    public final J0.a f18234k1 = new J0.a(this);

    /* renamed from: p1  reason: collision with root package name */
    public boolean f18239p1 = false;

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void B() {
        this.f18267H0 = true;
        Dialog dialog = this.f18235l1;
        if (dialog != null) {
            this.f18236m1 = true;
            dialog.setOnDismissListener(null);
            this.f18235l1.dismiss();
            if (!this.f18237n1) {
                onDismiss(this.f18235l1);
            }
            this.f18235l1 = null;
            this.f18239p1 = false;
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void C() {
        this.f18267H0 = true;
        if (!this.f18238o1 && !this.f18237n1) {
            this.f18237n1 = true;
        }
        this.f18280U0.h(this.f18234k1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x0030, B:20:0x0036, B:21:0x003b, B:22:0x003e, B:24:0x0046, B:27:0x0050, B:28:0x0068), top: B:46:0x001a }] */
    @Override // V1.AbstractComponentCallbacksC1480v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater D(Bundle bundle) {
        Context m10;
        LayoutInflater D6 = super.D(bundle);
        boolean z10 = this.f18231h1;
        if (z10 && !this.f18233j1) {
            if (z10 && !this.f18239p1) {
                try {
                    this.f18233j1 = true;
                    Dialog P = P();
                    this.f18235l1 = P;
                    if (this.f18231h1) {
                        int i10 = this.f18229e1;
                        if (i10 != 1 && i10 != 2) {
                            if (i10 == 3) {
                                Window window = P.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                m10 = m();
                                if (m10 instanceof Activity) {
                                    this.f18235l1.setOwnerActivity((Activity) m10);
                                }
                                this.f18235l1.setCancelable(this.g1);
                                this.f18235l1.setOnCancelListener(this.f18227c1);
                                this.f18235l1.setOnDismissListener(this.f18228d1);
                                this.f18239p1 = true;
                            }
                        }
                        P.requestWindowFeature(1);
                        m10 = m();
                        if (m10 instanceof Activity) {
                        }
                        this.f18235l1.setCancelable(this.g1);
                        this.f18235l1.setOnCancelListener(this.f18227c1);
                        this.f18235l1.setOnDismissListener(this.f18228d1);
                        this.f18239p1 = true;
                    } else {
                        this.f18235l1 = null;
                    }
                    this.f18233j1 = false;
                } catch (Throwable th2) {
                    this.f18233j1 = false;
                    throw th2;
                }
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f18235l1;
            if (dialog != null) {
                return D6.cloneInContext(dialog.getContext());
            }
            return D6;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f18231h1) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            } else {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            }
        }
        return D6;
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public void F(Bundle bundle) {
        Dialog dialog = this.f18235l1;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f18229e1;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f18230f1;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.g1;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f18231h1;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f18232i1;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public void G() {
        this.f18267H0 = true;
        Dialog dialog = this.f18235l1;
        if (dialog != null) {
            this.f18236m1 = false;
            dialog.show();
            View decorView = this.f18235l1.getWindow().getDecorView();
            K4.J.Z(decorView, this);
            AbstractC2279d.w(decorView, this);
            AbstractC5260f.N(decorView, this);
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public void H() {
        this.f18267H0 = true;
        Dialog dialog = this.f18235l1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void I(Bundle bundle) {
        Bundle bundle2;
        this.f18267H0 = true;
        if (this.f18235l1 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f18235l1.onRestoreInstanceState(bundle2);
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.f18269J0 == null && this.f18235l1 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f18235l1.onRestoreInstanceState(bundle2);
        }
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f18237n1) {
            return;
        }
        this.f18237n1 = true;
        this.f18238o1 = false;
        Dialog dialog = this.f18235l1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f18235l1.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f18226a1.getLooper()) {
                    onDismiss(this.f18235l1);
                } else {
                    this.f18226a1.post(this.b1);
                }
            }
        }
        this.f18236m1 = true;
        if (this.f18232i1 >= 0) {
            K o10 = o();
            int i10 = this.f18232i1;
            if (i10 >= 0) {
                o10.w(new J(o10, i10), z10);
                this.f18232i1 = -1;
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Bad id: ", i10));
        }
        C1460a c1460a = new C1460a(o());
        c1460a.f18146o = true;
        c1460a.g(this);
        if (z10) {
            c1460a.d(true);
        } else {
            c1460a.d(false);
        }
    }

    public Dialog P() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC3123p(K(), this.f18230f1);
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final AbstractC4694e g() {
        return new C1474o(this, new C1477s(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f18236m1) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            O(true, true);
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void v() {
        this.f18267H0 = true;
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void x(Context context) {
        Object obj;
        super.x(context);
        androidx.lifecycle.E e10 = this.f18280U0;
        J0.a aVar = this.f18234k1;
        e10.getClass();
        androidx.lifecycle.E.a("observeForever");
        androidx.lifecycle.C c10 = new androidx.lifecycle.C(e10, aVar);
        s.g gVar = e10.f25293b;
        s.c f6 = gVar.f(aVar);
        if (f6 != null) {
            obj = f6.f45004Z;
        } else {
            s.c cVar = new s.c(aVar, c10);
            gVar.f45015i0++;
            s.c cVar2 = gVar.f45013Z;
            if (cVar2 == null) {
                gVar.f45012Y = cVar;
                gVar.f45013Z = cVar;
            } else {
                cVar2.f45005h0 = cVar;
                cVar.f45006i0 = cVar2;
                gVar.f45013Z = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.C c11 = (androidx.lifecycle.C) obj;
        if (!(c11 instanceof androidx.lifecycle.B)) {
            if (c11 == null) {
                c10.a(true);
            }
            if (!this.f18238o1) {
                this.f18237n1 = false;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public void y(Bundle bundle) {
        boolean z10;
        super.y(bundle);
        this.f18226a1 = new Handler();
        if (this.f18261B0 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18231h1 = z10;
        if (bundle != null) {
            this.f18229e1 = bundle.getInt("android:style", 0);
            this.f18230f1 = bundle.getInt("android:theme", 0);
            this.g1 = bundle.getBoolean("android:cancelable", true);
            this.f18231h1 = bundle.getBoolean("android:showsDialog", this.f18231h1);
            this.f18232i1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}

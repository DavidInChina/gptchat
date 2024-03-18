package V1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2077l;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2082q;
import c1.AbstractC2279d;
import g.RunnableC3111d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import l2.C4333d;
import n.AbstractC4694e;
import n2.C4713d;
import p1.AbstractC5036a;
import p1.AbstractC5042g;
import q1.AbstractC5260f;

/* renamed from: V1.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1480v implements ComponentCallbacks, View.OnCreateContextMenuListener, AbstractC2086v, androidx.lifecycle.e0, AbstractC2077l, A3.f {

    /* renamed from: Z0  reason: collision with root package name */
    public static final Object f18259Z0 = new Object();

    /* renamed from: A0  reason: collision with root package name */
    public int f18260A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f18261B0;

    /* renamed from: C0  reason: collision with root package name */
    public String f18262C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f18263D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f18264E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f18265F0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f18267H0;

    /* renamed from: I0  reason: collision with root package name */
    public ViewGroup f18268I0;

    /* renamed from: J0  reason: collision with root package name */
    public View f18269J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f18270K0;

    /* renamed from: M0  reason: collision with root package name */
    public C1479u f18272M0;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f18273N0;

    /* renamed from: O0  reason: collision with root package name */
    public LayoutInflater f18274O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f18275P0;

    /* renamed from: Q0  reason: collision with root package name */
    public String f18276Q0;

    /* renamed from: S0  reason: collision with root package name */
    public C2088x f18278S0;

    /* renamed from: T0  reason: collision with root package name */
    public a0 f18279T0;

    /* renamed from: V0  reason: collision with root package name */
    public androidx.lifecycle.V f18281V0;

    /* renamed from: W0  reason: collision with root package name */
    public A3.e f18282W0;

    /* renamed from: Z  reason: collision with root package name */
    public Bundle f18286Z;

    /* renamed from: h0  reason: collision with root package name */
    public SparseArray f18287h0;

    /* renamed from: i0  reason: collision with root package name */
    public Bundle f18288i0;

    /* renamed from: k0  reason: collision with root package name */
    public Bundle f18290k0;

    /* renamed from: l0  reason: collision with root package name */
    public AbstractComponentCallbacksC1480v f18291l0;

    /* renamed from: n0  reason: collision with root package name */
    public int f18293n0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f18295p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f18296q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f18297r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f18298s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f18299t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f18300u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f18301v0;

    /* renamed from: w0  reason: collision with root package name */
    public K f18302w0;

    /* renamed from: x0  reason: collision with root package name */
    public C1482x f18303x0;

    /* renamed from: z0  reason: collision with root package name */
    public AbstractComponentCallbacksC1480v f18305z0;

    /* renamed from: Y  reason: collision with root package name */
    public int f18284Y = -1;

    /* renamed from: j0  reason: collision with root package name */
    public String f18289j0 = UUID.randomUUID().toString();

    /* renamed from: m0  reason: collision with root package name */
    public String f18292m0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public Boolean f18294o0 = null;

    /* renamed from: y0  reason: collision with root package name */
    public K f18304y0 = new K();

    /* renamed from: G0  reason: collision with root package name */
    public final boolean f18266G0 = true;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f18271L0 = true;

    /* renamed from: R0  reason: collision with root package name */
    public EnumC2082q f18277R0 = EnumC2082q.f25379j0;

    /* renamed from: U0  reason: collision with root package name */
    public final androidx.lifecycle.E f18280U0 = new androidx.lifecycle.E();

    /* renamed from: X0  reason: collision with root package name */
    public final ArrayList f18283X0 = new ArrayList();

    /* renamed from: Y0  reason: collision with root package name */
    public final r f18285Y0 = new r(this);

    public AbstractComponentCallbacksC1480v() {
        new AtomicInteger();
        q();
    }

    public void A() {
        this.f18267H0 = true;
    }

    public void B() {
        this.f18267H0 = true;
    }

    public void C() {
        this.f18267H0 = true;
    }

    public LayoutInflater D(Bundle bundle) {
        C1482x c1482x = this.f18303x0;
        if (c1482x != null) {
            AbstractActivityC1483y abstractActivityC1483y = c1482x.f18312j0;
            LayoutInflater cloneInContext = abstractActivityC1483y.getLayoutInflater().cloneInContext(abstractActivityC1483y);
            cloneInContext.setFactory2(this.f18304y0.f18049f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void E() {
        this.f18267H0 = true;
    }

    public abstract void F(Bundle bundle);

    public void G() {
        this.f18267H0 = true;
    }

    public void H() {
        this.f18267H0 = true;
    }

    public void I(Bundle bundle) {
        this.f18267H0 = true;
    }

    public void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18304y0.N();
        this.f18300u0 = true;
        this.f18279T0 = new a0(this, e(), new RunnableC3111d(11, this));
        View z10 = z(layoutInflater, viewGroup);
        this.f18269J0 = z10;
        if (z10 != null) {
            this.f18279T0.g();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f18269J0 + " for Fragment " + this);
            }
            K4.J.Z(this.f18269J0, this.f18279T0);
            AbstractC2279d.w(this.f18269J0, this.f18279T0);
            AbstractC5260f.N(this.f18269J0, this.f18279T0);
            this.f18280U0.i(this.f18279T0);
        } else if (this.f18279T0.f18154j0 == null) {
            this.f18279T0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final Context K() {
        Context m10 = m();
        if (m10 != null) {
            return m10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View L() {
        View view = this.f18269J0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void M(int i10, int i11, int i12, int i13) {
        if (this.f18272M0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        j().f18247b = i10;
        j().f18248c = i11;
        j().f18249d = i12;
        j().f18250e = i13;
    }

    public final void N(Bundle bundle) {
        K k10 = this.f18302w0;
        if (k10 != null && k10 != null && k10.L()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f18290k0 = bundle;
    }

    @Override // androidx.lifecycle.AbstractC2077l
    public final androidx.lifecycle.b0 b() {
        Application application;
        if (this.f18302w0 != null) {
            if (this.f18281V0 == null) {
                Context applicationContext = K().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f18281V0 = new androidx.lifecycle.V(application, this, this.f18290k0);
            }
            return this.f18281V0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.AbstractC2077l
    public final C4333d c() {
        Application application;
        Context applicationContext = K().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C4333d c4333d = new C4333d(0);
        if (application != null) {
            c4333d.a(androidx.lifecycle.Z.f25347Y, application);
        }
        c4333d.a(androidx.lifecycle.S.f25325a, this);
        c4333d.a(androidx.lifecycle.S.f25326b, this);
        Bundle bundle = this.f18290k0;
        if (bundle != null) {
            c4333d.a(androidx.lifecycle.S.f25327c, bundle);
        }
        return c4333d;
    }

    @Override // androidx.lifecycle.e0
    public final androidx.lifecycle.d0 e() {
        if (this.f18302w0 != null) {
            if (n() != 1) {
                HashMap hashMap = this.f18302w0.f18042M.f18081f;
                androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) hashMap.get(this.f18289j0);
                if (d0Var == null) {
                    androidx.lifecycle.d0 d0Var2 = new androidx.lifecycle.d0();
                    hashMap.put(this.f18289j0, d0Var2);
                    return d0Var2;
                }
                return d0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // A3.f
    public final A3.d f() {
        return this.f18282W0.f645b;
    }

    public AbstractC4694e g() {
        return new C1477s(this);
    }

    @Override // androidx.lifecycle.AbstractC2086v
    public final androidx.lifecycle.S h() {
        return this.f18278S0;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f18260A0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f18261B0));
        printWriter.print(" mTag=");
        printWriter.println(this.f18262C0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f18284Y);
        printWriter.print(" mWho=");
        printWriter.print(this.f18289j0);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f18301v0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f18295p0);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f18296q0);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f18297r0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f18298s0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f18263D0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f18264E0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f18266G0);
        printWriter.print(" mHasMenu=");
        int i13 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f18265F0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f18271L0);
        if (this.f18302w0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f18302w0);
        }
        if (this.f18303x0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f18303x0);
        }
        if (this.f18305z0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f18305z0);
        }
        if (this.f18290k0 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f18290k0);
        }
        if (this.f18286Z != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f18286Z);
        }
        if (this.f18287h0 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f18287h0);
        }
        if (this.f18288i0 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f18288i0);
        }
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18291l0;
        if (abstractComponentCallbacksC1480v == null) {
            K k10 = this.f18302w0;
            if (k10 != null && (str2 = this.f18292m0) != null) {
                abstractComponentCallbacksC1480v = k10.f18046c.s(str2);
            } else {
                abstractComponentCallbacksC1480v = null;
            }
        }
        if (abstractComponentCallbacksC1480v != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC1480v);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f18293n0);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C1479u c1479u = this.f18272M0;
        if (c1479u == null) {
            z10 = false;
        } else {
            z10 = c1479u.f18246a;
        }
        printWriter.println(z10);
        C1479u c1479u2 = this.f18272M0;
        if (c1479u2 != null && c1479u2.f18247b != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C1479u c1479u3 = this.f18272M0;
            if (c1479u3 == null) {
                i12 = 0;
            } else {
                i12 = c1479u3.f18247b;
            }
            printWriter.println(i12);
        }
        C1479u c1479u4 = this.f18272M0;
        if (c1479u4 != null && c1479u4.f18248c != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C1479u c1479u5 = this.f18272M0;
            if (c1479u5 == null) {
                i11 = 0;
            } else {
                i11 = c1479u5.f18248c;
            }
            printWriter.println(i11);
        }
        C1479u c1479u6 = this.f18272M0;
        if (c1479u6 != null && c1479u6.f18249d != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C1479u c1479u7 = this.f18272M0;
            if (c1479u7 == null) {
                i10 = 0;
            } else {
                i10 = c1479u7.f18249d;
            }
            printWriter.println(i10);
        }
        C1479u c1479u8 = this.f18272M0;
        if (c1479u8 != null && c1479u8.f18250e != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C1479u c1479u9 = this.f18272M0;
            if (c1479u9 != null) {
                i13 = c1479u9.f18250e;
            }
            printWriter.println(i13);
        }
        if (this.f18268I0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f18268I0);
        }
        if (this.f18269J0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f18269J0);
        }
        if (m() != null) {
            new C4713d(this, e()).F0(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f18304y0 + ":");
        this.f18304y0.u(android.gov.nist.core.a.g(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [V1.u, java.lang.Object] */
    public final C1479u j() {
        if (this.f18272M0 == null) {
            ?? obj = new Object();
            Object obj2 = f18259Z0;
            obj.f18254i = obj2;
            obj.f18255j = obj2;
            obj.f18256k = obj2;
            obj.f18257l = 1.0f;
            obj.f18258m = null;
            this.f18272M0 = obj;
        }
        return this.f18272M0;
    }

    /* renamed from: k */
    public final AbstractActivityC1483y d() {
        C1482x c1482x = this.f18303x0;
        if (c1482x == null) {
            return null;
        }
        return (AbstractActivityC1483y) c1482x.f18308Y;
    }

    public final K l() {
        if (this.f18303x0 != null) {
            return this.f18304y0;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context m() {
        C1482x c1482x = this.f18303x0;
        if (c1482x == null) {
            return null;
        }
        return c1482x.f18309Z;
    }

    public final int n() {
        EnumC2082q enumC2082q = this.f18277R0;
        if (enumC2082q != EnumC2082q.f25376Z && this.f18305z0 != null) {
            return Math.min(enumC2082q.ordinal(), this.f18305z0.n());
        }
        return enumC2082q.ordinal();
    }

    public final K o() {
        K k10 = this.f18302w0;
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f18267H0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AbstractActivityC1483y d10 = d();
        if (d10 != null) {
            d10.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f18267H0 = true;
    }

    public final Resources p() {
        return K().getResources();
    }

    public final void q() {
        this.f18278S0 = new C2088x(this);
        this.f18282W0 = new A3.e(this);
        Bundle bundle = null;
        this.f18281V0 = null;
        ArrayList arrayList = this.f18283X0;
        r rVar = this.f18285Y0;
        if (!arrayList.contains(rVar)) {
            if (this.f18284Y >= 0) {
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = rVar.f18242a;
                abstractComponentCallbacksC1480v.f18282W0.a();
                androidx.lifecycle.S.e(abstractComponentCallbacksC1480v);
                Bundle bundle2 = abstractComponentCallbacksC1480v.f18286Z;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle("registryState");
                }
                abstractComponentCallbacksC1480v.f18282W0.b(bundle);
                return;
            }
            arrayList.add(rVar);
        }
    }

    public final void r() {
        q();
        this.f18276Q0 = this.f18289j0;
        this.f18289j0 = UUID.randomUUID().toString();
        this.f18295p0 = false;
        this.f18296q0 = false;
        this.f18297r0 = false;
        this.f18298s0 = false;
        this.f18299t0 = false;
        this.f18301v0 = 0;
        this.f18302w0 = null;
        this.f18304y0 = new K();
        this.f18303x0 = null;
        this.f18260A0 = 0;
        this.f18261B0 = 0;
        this.f18262C0 = null;
        this.f18263D0 = false;
        this.f18264E0 = false;
    }

    public final boolean s() {
        if (this.f18303x0 != null && this.f18295p0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [V1.H, java.lang.Object] */
    public final void startActivityForResult(Intent intent, int i10) {
        if (this.f18303x0 != null) {
            K o10 = o();
            if (o10.f18030A != null) {
                String str = this.f18289j0;
                ?? obj = new Object();
                obj.f18025Y = str;
                obj.f18026Z = i10;
                o10.f18033D.addLast(obj);
                o10.f18030A.K(intent);
                return;
            }
            C1482x c1482x = o10.f18064u;
            c1482x.getClass();
            if (i10 == -1) {
                Object obj2 = AbstractC5042g.f41723a;
                AbstractC5036a.b(c1482x.f18309Z, intent, null);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final boolean t() {
        if (!this.f18263D0) {
            K k10 = this.f18302w0;
            if (k10 != null) {
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18305z0;
                k10.getClass();
                if (abstractComponentCallbacksC1480v != null && abstractComponentCallbacksC1480v.t()) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f18289j0);
        if (this.f18260A0 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f18260A0));
        }
        if (this.f18262C0 != null) {
            sb2.append(" tag=");
            sb2.append(this.f18262C0);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }

    public final boolean u() {
        if (this.f18301v0 > 0) {
            return true;
        }
        return false;
    }

    public void v() {
        this.f18267H0 = true;
    }

    public void w(int i10, int i11, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void x(Context context) {
        Activity activity;
        this.f18267H0 = true;
        C1482x c1482x = this.f18303x0;
        if (c1482x == null) {
            activity = null;
        } else {
            activity = c1482x.f18308Y;
        }
        if (activity != null) {
            this.f18267H0 = true;
        }
    }

    public void y(Bundle bundle) {
        Bundle bundle2;
        this.f18267H0 = true;
        Bundle bundle3 = this.f18286Z;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f18304y0.T(bundle2);
            K k10 = this.f18304y0;
            k10.f18035F = false;
            k10.f18036G = false;
            k10.f18042M.f18084i = false;
            k10.t(1);
        }
        K k11 = this.f18304y0;
        if (k11.f18063t < 1) {
            k11.f18035F = false;
            k11.f18036G = false;
            k11.f18042M.f18084i = false;
            k11.t(1);
        }
    }

    public View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }
}

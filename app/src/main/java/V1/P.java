package V1;

import H0.n1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.EnumC2082q;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import n2.C4710a;
import n2.C4712c;
import w.C6050B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final U3.e f18099a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.i f18100b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractComponentCallbacksC1480v f18101c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18102d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f18103e = -1;

    public P(U3.e eVar, U3.i iVar, AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        this.f18099a = eVar;
        this.f18100b = iVar;
        this.f18101c = abstractComponentCallbacksC1480v;
    }

    public final void a() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC1480v);
        }
        Bundle bundle2 = abstractComponentCallbacksC1480v.f18286Z;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC1480v.f18304y0.N();
        abstractComponentCallbacksC1480v.f18284Y = 3;
        abstractComponentCallbacksC1480v.f18267H0 = false;
        abstractComponentCallbacksC1480v.v();
        if (abstractComponentCallbacksC1480v.f18267H0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC1480v);
            }
            if (abstractComponentCallbacksC1480v.f18269J0 != null) {
                Bundle bundle3 = abstractComponentCallbacksC1480v.f18286Z;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC1480v.f18287h0;
                if (sparseArray != null) {
                    abstractComponentCallbacksC1480v.f18269J0.restoreHierarchyState(sparseArray);
                    abstractComponentCallbacksC1480v.f18287h0 = null;
                }
                abstractComponentCallbacksC1480v.f18267H0 = false;
                abstractComponentCallbacksC1480v.I(bundle);
                if (abstractComponentCallbacksC1480v.f18267H0) {
                    if (abstractComponentCallbacksC1480v.f18269J0 != null) {
                        abstractComponentCallbacksC1480v.f18279T0.d(EnumC2081p.ON_CREATE);
                    }
                } else {
                    throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onViewStateRestored()");
                }
            }
            abstractComponentCallbacksC1480v.f18286Z = null;
            K k10 = abstractComponentCallbacksC1480v.f18304y0;
            k10.f18035F = false;
            k10.f18036G = false;
            k10.f18042M.f18084i = false;
            k10.t(4);
            this.f18099a.f(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onActivityCreated()");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r4 >= ((java.util.ArrayList) r1.f17414Y).size()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
        r5 = (V1.AbstractComponentCallbacksC1480v) ((java.util.ArrayList) r1.f17414Y).get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
        if (r5.f18268I0 != r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
        r5 = r5.f18269J0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
        r3 = r2.indexOfChild(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        View view;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        AbstractComponentCallbacksC1480v C10 = K.C(abstractComponentCallbacksC1480v.f18268I0);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = abstractComponentCallbacksC1480v.f18305z0;
        if (C10 != null && !C10.equals(abstractComponentCallbacksC1480v2)) {
            int i10 = abstractComponentCallbacksC1480v.f18261B0;
            W1.b bVar = W1.c.f20682a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(abstractComponentCallbacksC1480v);
            sb2.append(" within the view of parent fragment ");
            sb2.append(C10);
            sb2.append(" via container with ID ");
            W1.e eVar = new W1.e(abstractComponentCallbacksC1480v, android.gov.nist.core.a.l(sb2, i10, " without using parent's childFragmentManager"));
            W1.c.c(eVar);
            W1.b a5 = W1.c.a(abstractComponentCallbacksC1480v);
            if (a5.f20680a.contains(W1.a.f20676j0) && W1.c.e(a5, abstractComponentCallbacksC1480v.getClass(), W1.f.class)) {
                W1.c.b(a5, eVar);
            }
        }
        U3.i iVar = this.f18100b;
        iVar.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC1480v.f18268I0;
        int i11 = -1;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) iVar.f17414Y).indexOf(abstractComponentCallbacksC1480v);
            int i12 = indexOf - 1;
            while (true) {
                if (i12 >= 0) {
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v3 = (AbstractComponentCallbacksC1480v) ((ArrayList) iVar.f17414Y).get(i12);
                    if (abstractComponentCallbacksC1480v3.f18268I0 == viewGroup && (view = abstractComponentCallbacksC1480v3.f18269J0) != null) {
                        i11 = viewGroup.indexOfChild(view) + 1;
                        break;
                    }
                    i12--;
                }
            }
        }
        abstractComponentCallbacksC1480v.f18268I0.addView(abstractComponentCallbacksC1480v.f18269J0, i11);
    }

    public final void c() {
        P p10;
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC1480v);
        }
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = abstractComponentCallbacksC1480v.f18291l0;
        U3.i iVar = this.f18100b;
        if (abstractComponentCallbacksC1480v2 != null) {
            p10 = (P) ((HashMap) iVar.f17415Z).get(abstractComponentCallbacksC1480v2.f18289j0);
            if (p10 != null) {
                abstractComponentCallbacksC1480v.f18292m0 = abstractComponentCallbacksC1480v.f18291l0.f18289j0;
                abstractComponentCallbacksC1480v.f18291l0 = null;
            } else {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1480v + " declared target fragment " + abstractComponentCallbacksC1480v.f18291l0 + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = abstractComponentCallbacksC1480v.f18292m0;
            if (str != null) {
                p10 = (P) ((HashMap) iVar.f17415Z).get(str);
                if (p10 == null) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(abstractComponentCallbacksC1480v);
                    sb2.append(" declared target fragment ");
                    throw new IllegalStateException(R.a.t(sb2, abstractComponentCallbacksC1480v.f18292m0, " that does not belong to this FragmentManager!"));
                }
            } else {
                p10 = null;
            }
        }
        if (p10 != null) {
            p10.k();
        }
        K k10 = abstractComponentCallbacksC1480v.f18302w0;
        abstractComponentCallbacksC1480v.f18303x0 = k10.f18064u;
        abstractComponentCallbacksC1480v.f18305z0 = k10.f18066w;
        U3.e eVar = this.f18099a;
        eVar.n(false);
        ArrayList arrayList = abstractComponentCallbacksC1480v.f18283X0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v3 = ((r) it.next()).f18242a;
            abstractComponentCallbacksC1480v3.f18282W0.a();
            androidx.lifecycle.S.e(abstractComponentCallbacksC1480v3);
            Bundle bundle2 = abstractComponentCallbacksC1480v3.f18286Z;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            abstractComponentCallbacksC1480v3.f18282W0.b(bundle);
        }
        arrayList.clear();
        abstractComponentCallbacksC1480v.f18304y0.b(abstractComponentCallbacksC1480v.f18303x0, abstractComponentCallbacksC1480v.g(), abstractComponentCallbacksC1480v);
        abstractComponentCallbacksC1480v.f18284Y = 0;
        abstractComponentCallbacksC1480v.f18267H0 = false;
        abstractComponentCallbacksC1480v.x(abstractComponentCallbacksC1480v.f18303x0.f18309Z);
        if (abstractComponentCallbacksC1480v.f18267H0) {
            Iterator it2 = abstractComponentCallbacksC1480v.f18302w0.f18057n.iterator();
            while (it2.hasNext()) {
                ((N) it2.next()).b();
            }
            K k11 = abstractComponentCallbacksC1480v.f18304y0;
            k11.f18035F = false;
            k11.f18036G = false;
            k11.f18042M.f18084i = false;
            k11.t(0);
            eVar.g(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onAttach()");
    }

    public final int d() {
        int i10;
        Object obj;
        int i11;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (abstractComponentCallbacksC1480v.f18302w0 == null) {
            return abstractComponentCallbacksC1480v.f18284Y;
        }
        int i12 = this.f18103e;
        int ordinal = abstractComponentCallbacksC1480v.f18277R0.ordinal();
        int i13 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i12 = Math.min(i12, -1);
                    }
                } else {
                    i12 = Math.min(i12, 5);
                }
            } else {
                i12 = Math.min(i12, 1);
            }
        } else {
            i12 = Math.min(i12, 0);
        }
        if (abstractComponentCallbacksC1480v.f18297r0) {
            if (abstractComponentCallbacksC1480v.f18298s0) {
                i12 = Math.max(this.f18103e, 2);
                View view = abstractComponentCallbacksC1480v.f18269J0;
                if (view != null && view.getParent() == null) {
                    i12 = Math.min(i12, 2);
                }
            } else {
                i12 = this.f18103e < 4 ? Math.min(i12, abstractComponentCallbacksC1480v.f18284Y) : Math.min(i12, 1);
            }
        }
        if (!abstractComponentCallbacksC1480v.f18295p0) {
            i12 = Math.min(i12, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1480v.f18268I0;
        if (viewGroup != null) {
            C1471l l10 = C1471l.l(viewGroup, abstractComponentCallbacksC1480v.o());
            l10.getClass();
            e0 j6 = l10.j(abstractComponentCallbacksC1480v);
            if (j6 != null) {
                i10 = j6.f18184b;
            } else {
                i10 = 0;
            }
            Iterator it = l10.f18218c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    e0 e0Var = (e0) obj;
                    if (AbstractC3557B.K(e0Var.f18185c, abstractComponentCallbacksC1480v) && !e0Var.f18188f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            e0 e0Var2 = (e0) obj;
            if (e0Var2 != null) {
                i13 = e0Var2.f18184b;
            }
            if (i10 == 0) {
                i11 = -1;
            } else {
                i11 = f0.f18195a[AbstractC6708l.f(i10)];
            }
            if (i11 != -1 && i11 != 1) {
                i13 = i10;
            }
        }
        if (i13 == 2) {
            i12 = Math.min(i12, 6);
        } else if (i13 == 3) {
            i12 = Math.max(i12, 3);
        } else if (abstractComponentCallbacksC1480v.f18296q0) {
            if (abstractComponentCallbacksC1480v.u()) {
                i12 = Math.min(i12, 1);
            } else {
                i12 = Math.min(i12, -1);
            }
        }
        if (abstractComponentCallbacksC1480v.f18270K0 && abstractComponentCallbacksC1480v.f18284Y < 5) {
            i12 = Math.min(i12, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i12 + " for " + abstractComponentCallbacksC1480v);
        }
        return i12;
    }

    public final void e() {
        Bundle bundle;
        Bundle bundle2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC1480v);
        }
        Bundle bundle3 = abstractComponentCallbacksC1480v.f18286Z;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!abstractComponentCallbacksC1480v.f18275P0) {
            U3.e eVar = this.f18099a;
            eVar.o(false);
            abstractComponentCallbacksC1480v.f18304y0.N();
            abstractComponentCallbacksC1480v.f18284Y = 1;
            abstractComponentCallbacksC1480v.f18267H0 = false;
            abstractComponentCallbacksC1480v.f18278S0.a(new C1478t(abstractComponentCallbacksC1480v));
            abstractComponentCallbacksC1480v.y(bundle);
            abstractComponentCallbacksC1480v.f18275P0 = true;
            if (abstractComponentCallbacksC1480v.f18267H0) {
                abstractComponentCallbacksC1480v.f18278S0.k(EnumC2081p.ON_CREATE);
                eVar.h(false);
                return;
            }
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onCreate()");
        }
        abstractComponentCallbacksC1480v.f18284Y = 1;
        Bundle bundle4 = abstractComponentCallbacksC1480v.f18286Z;
        if (bundle4 != null && (bundle2 = bundle4.getBundle("childFragmentManager")) != null) {
            abstractComponentCallbacksC1480v.f18304y0.T(bundle2);
            K k10 = abstractComponentCallbacksC1480v.f18304y0;
            k10.f18035F = false;
            k10.f18036G = false;
            k10.f18042M.f18084i = false;
            k10.t(1);
        }
    }

    public final void f() {
        Bundle bundle;
        String str;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (abstractComponentCallbacksC1480v.f18297r0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC1480v);
        }
        Bundle bundle2 = abstractComponentCallbacksC1480v.f18286Z;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater D6 = abstractComponentCallbacksC1480v.D(bundle);
        abstractComponentCallbacksC1480v.f18274O0 = D6;
        ViewGroup viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = abstractComponentCallbacksC1480v.f18261B0;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) abstractComponentCallbacksC1480v.f18302w0.f18065v.k(i10);
                    if (viewGroup == null) {
                        if (!abstractComponentCallbacksC1480v.f18299t0) {
                            try {
                                str = abstractComponentCallbacksC1480v.p().getResourceName(abstractComponentCallbacksC1480v.f18261B0);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC1480v.f18261B0) + " (" + str + ") for fragment " + abstractComponentCallbacksC1480v);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        W1.b bVar = W1.c.f20682a;
                        W1.d dVar = new W1.d(abstractComponentCallbacksC1480v, viewGroup, 1);
                        W1.c.c(dVar);
                        W1.b a5 = W1.c.a(abstractComponentCallbacksC1480v);
                        if (a5.f20680a.contains(W1.a.f20677k0) && W1.c.e(a5, abstractComponentCallbacksC1480v.getClass(), W1.d.class)) {
                            W1.c.b(a5, dVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC1480v + " for a container view with no id");
                }
            }
        }
        abstractComponentCallbacksC1480v.f18268I0 = viewGroup;
        abstractComponentCallbacksC1480v.J(D6, viewGroup, bundle);
        if (abstractComponentCallbacksC1480v.f18269J0 != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC1480v);
            }
            abstractComponentCallbacksC1480v.f18269J0.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC1480v.f18269J0.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1480v);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC1480v.f18263D0) {
                abstractComponentCallbacksC1480v.f18269J0.setVisibility(8);
            }
            View view = abstractComponentCallbacksC1480v.f18269J0;
            WeakHashMap weakHashMap = D1.Z.f3247a;
            if (D1.K.b(view)) {
                D1.L.c(abstractComponentCallbacksC1480v.f18269J0);
            } else {
                View view2 = abstractComponentCallbacksC1480v.f18269J0;
                view2.addOnAttachStateChangeListener(new n1(this, 2, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC1480v.f18286Z;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC1480v.f18304y0.t(2);
            this.f18099a.t(false);
            int visibility = abstractComponentCallbacksC1480v.f18269J0.getVisibility();
            abstractComponentCallbacksC1480v.j().f18257l = abstractComponentCallbacksC1480v.f18269J0.getAlpha();
            if (abstractComponentCallbacksC1480v.f18268I0 != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC1480v.f18269J0.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC1480v.j().f18258m = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC1480v);
                    }
                }
                abstractComponentCallbacksC1480v.f18269J0.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC1480v.f18284Y = 2;
    }

    public final void g() {
        boolean z10;
        AbstractComponentCallbacksC1480v s10;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC1480v);
        }
        boolean z11 = true;
        if (abstractComponentCallbacksC1480v.f18296q0 && !abstractComponentCallbacksC1480v.u()) {
            z10 = true;
        } else {
            z10 = false;
        }
        U3.i iVar = this.f18100b;
        if (z10) {
            iVar.J(null, abstractComponentCallbacksC1480v.f18289j0);
        }
        if (!z10) {
            M m10 = (M) iVar.f17417i0;
            if (m10.f18079d.containsKey(abstractComponentCallbacksC1480v.f18289j0) && m10.f18082g && !m10.f18083h) {
                String str = abstractComponentCallbacksC1480v.f18292m0;
                if (str != null && (s10 = iVar.s(str)) != null && s10.f18265F0) {
                    abstractComponentCallbacksC1480v.f18291l0 = s10;
                }
                abstractComponentCallbacksC1480v.f18284Y = 0;
                return;
            }
        }
        C1482x c1482x = abstractComponentCallbacksC1480v.f18303x0;
        if (c1482x instanceof androidx.lifecycle.e0) {
            z11 = ((M) iVar.f17417i0).f18083h;
        } else {
            Context context = c1482x.f18309Z;
            if (context instanceof Activity) {
                z11 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10 || z11) {
            ((M) iVar.f17417i0).e(abstractComponentCallbacksC1480v, false);
        }
        abstractComponentCallbacksC1480v.f18304y0.k();
        abstractComponentCallbacksC1480v.f18278S0.k(EnumC2081p.ON_DESTROY);
        abstractComponentCallbacksC1480v.f18284Y = 0;
        abstractComponentCallbacksC1480v.f18267H0 = false;
        abstractComponentCallbacksC1480v.f18275P0 = false;
        abstractComponentCallbacksC1480v.A();
        if (abstractComponentCallbacksC1480v.f18267H0) {
            this.f18099a.k(false);
            Iterator it = iVar.v().iterator();
            while (it.hasNext()) {
                P p10 = (P) it.next();
                if (p10 != null) {
                    String str2 = abstractComponentCallbacksC1480v.f18289j0;
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = p10.f18101c;
                    if (str2.equals(abstractComponentCallbacksC1480v2.f18292m0)) {
                        abstractComponentCallbacksC1480v2.f18291l0 = abstractComponentCallbacksC1480v;
                        abstractComponentCallbacksC1480v2.f18292m0 = null;
                    }
                }
            }
            String str3 = abstractComponentCallbacksC1480v.f18292m0;
            if (str3 != null) {
                abstractComponentCallbacksC1480v.f18291l0 = iVar.s(str3);
            }
            iVar.E(this);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onDestroy()");
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC1480v);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1480v.f18268I0;
        if (viewGroup != null && (view = abstractComponentCallbacksC1480v.f18269J0) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC1480v.f18304y0.t(1);
        if (abstractComponentCallbacksC1480v.f18269J0 != null) {
            a0 a0Var = abstractComponentCallbacksC1480v.f18279T0;
            a0Var.g();
            if (a0Var.f18154j0.f25386f.a(EnumC2082q.f25377h0)) {
                abstractComponentCallbacksC1480v.f18279T0.d(EnumC2081p.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC1480v.f18284Y = 1;
        abstractComponentCallbacksC1480v.f18267H0 = false;
        abstractComponentCallbacksC1480v.B();
        if (abstractComponentCallbacksC1480v.f18267H0) {
            C6050B c6050b = ((C4712c) new U3.u(abstractComponentCallbacksC1480v.e(), C4712c.f39604f).l(C4712c.class)).f39605d;
            int f6 = c6050b.f();
            for (int i10 = 0; i10 < f6; i10++) {
                ((C4710a) c6050b.g(i10)).j();
            }
            abstractComponentCallbacksC1480v.f18300u0 = false;
            this.f18099a.u(false);
            abstractComponentCallbacksC1480v.f18268I0 = null;
            abstractComponentCallbacksC1480v.f18269J0 = null;
            abstractComponentCallbacksC1480v.f18279T0 = null;
            abstractComponentCallbacksC1480v.f18280U0.i(null);
            abstractComponentCallbacksC1480v.f18298s0 = false;
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onDestroyView()");
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC1480v);
        }
        abstractComponentCallbacksC1480v.f18284Y = -1;
        abstractComponentCallbacksC1480v.f18267H0 = false;
        abstractComponentCallbacksC1480v.C();
        abstractComponentCallbacksC1480v.f18274O0 = null;
        if (abstractComponentCallbacksC1480v.f18267H0) {
            K k10 = abstractComponentCallbacksC1480v.f18304y0;
            if (!k10.f18037H) {
                k10.k();
                abstractComponentCallbacksC1480v.f18304y0 = new K();
            }
            this.f18099a.l(false);
            abstractComponentCallbacksC1480v.f18284Y = -1;
            abstractComponentCallbacksC1480v.f18303x0 = null;
            abstractComponentCallbacksC1480v.f18305z0 = null;
            abstractComponentCallbacksC1480v.f18302w0 = null;
            if (!abstractComponentCallbacksC1480v.f18296q0 || abstractComponentCallbacksC1480v.u()) {
                M m10 = (M) this.f18100b.f17417i0;
                if (m10.f18079d.containsKey(abstractComponentCallbacksC1480v.f18289j0) && m10.f18082g && !m10.f18083h) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC1480v);
            }
            abstractComponentCallbacksC1480v.r();
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onDetach()");
    }

    public final void j() {
        Bundle bundle;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (abstractComponentCallbacksC1480v.f18297r0 && abstractComponentCallbacksC1480v.f18298s0 && !abstractComponentCallbacksC1480v.f18300u0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC1480v);
            }
            Bundle bundle2 = abstractComponentCallbacksC1480v.f18286Z;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater D6 = abstractComponentCallbacksC1480v.D(bundle);
            abstractComponentCallbacksC1480v.f18274O0 = D6;
            abstractComponentCallbacksC1480v.J(D6, null, bundle);
            View view = abstractComponentCallbacksC1480v.f18269J0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC1480v.f18269J0.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1480v);
                if (abstractComponentCallbacksC1480v.f18263D0) {
                    abstractComponentCallbacksC1480v.f18269J0.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC1480v.f18286Z;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC1480v.f18304y0.t(2);
                this.f18099a.t(false);
                abstractComponentCallbacksC1480v.f18284Y = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        U3.i iVar = this.f18100b;
        boolean z10 = this.f18102d;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (z10) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC1480v);
                return;
            }
            return;
        }
        try {
            this.f18102d = true;
            boolean z11 = false;
            while (true) {
                int d10 = d();
                int i10 = abstractComponentCallbacksC1480v.f18284Y;
                int i11 = 3;
                if (d10 != i10) {
                    if (d10 > i10) {
                        switch (i10 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (abstractComponentCallbacksC1480v.f18269J0 != null && (viewGroup3 = abstractComponentCallbacksC1480v.f18268I0) != null) {
                                    C1471l l10 = C1471l.l(viewGroup3, abstractComponentCallbacksC1480v.o());
                                    int visibility = abstractComponentCallbacksC1480v.f18269J0.getVisibility();
                                    if (visibility != 0) {
                                        if (visibility != 4) {
                                            if (visibility != 8) {
                                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
                                        } else {
                                            i11 = 4;
                                        }
                                    } else {
                                        i11 = 2;
                                    }
                                    l10.c(i11, this);
                                }
                                abstractComponentCallbacksC1480v.f18284Y = 4;
                                continue;
                            case 5:
                                q();
                                continue;
                            case 6:
                                abstractComponentCallbacksC1480v.f18284Y = 6;
                                continue;
                            case 7:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                g();
                                continue;
                            case 1:
                                h();
                                abstractComponentCallbacksC1480v.f18284Y = 1;
                                continue;
                            case 2:
                                abstractComponentCallbacksC1480v.f18298s0 = false;
                                abstractComponentCallbacksC1480v.f18284Y = 2;
                                continue;
                            case 3:
                                if (Log.isLoggable("FragmentManager", 3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC1480v);
                                }
                                if (abstractComponentCallbacksC1480v.f18269J0 != null && abstractComponentCallbacksC1480v.f18287h0 == null) {
                                    p();
                                }
                                if (abstractComponentCallbacksC1480v.f18269J0 != null && (viewGroup2 = abstractComponentCallbacksC1480v.f18268I0) != null) {
                                    C1471l.l(viewGroup2, abstractComponentCallbacksC1480v.o()).e(this);
                                }
                                abstractComponentCallbacksC1480v.f18284Y = 3;
                                continue;
                            case 4:
                                r();
                                continue;
                            case 5:
                                abstractComponentCallbacksC1480v.f18284Y = 5;
                                continue;
                            case 6:
                                l();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z11 = true;
                } else {
                    if (!z11 && i10 == -1 && abstractComponentCallbacksC1480v.f18296q0 && !abstractComponentCallbacksC1480v.u()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC1480v);
                        }
                        ((M) iVar.f17417i0).e(abstractComponentCallbacksC1480v, true);
                        iVar.E(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC1480v);
                        }
                        abstractComponentCallbacksC1480v.r();
                    }
                    if (abstractComponentCallbacksC1480v.f18273N0) {
                        if (abstractComponentCallbacksC1480v.f18269J0 != null && (viewGroup = abstractComponentCallbacksC1480v.f18268I0) != null) {
                            C1471l l11 = C1471l.l(viewGroup, abstractComponentCallbacksC1480v.o());
                            if (abstractComponentCallbacksC1480v.f18263D0) {
                                l11.d(this);
                            } else {
                                l11.f(this);
                            }
                        }
                        K k10 = abstractComponentCallbacksC1480v.f18302w0;
                        if (k10 != null && abstractComponentCallbacksC1480v.f18295p0 && K.H(abstractComponentCallbacksC1480v)) {
                            k10.f18034E = true;
                        }
                        abstractComponentCallbacksC1480v.f18273N0 = false;
                        abstractComponentCallbacksC1480v.f18304y0.n();
                    }
                    this.f18102d = false;
                    return;
                }
            }
        } catch (Throwable th2) {
            this.f18102d = false;
            throw th2;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC1480v);
        }
        abstractComponentCallbacksC1480v.f18304y0.t(5);
        if (abstractComponentCallbacksC1480v.f18269J0 != null) {
            abstractComponentCallbacksC1480v.f18279T0.d(EnumC2081p.ON_PAUSE);
        }
        abstractComponentCallbacksC1480v.f18278S0.k(EnumC2081p.ON_PAUSE);
        abstractComponentCallbacksC1480v.f18284Y = 6;
        abstractComponentCallbacksC1480v.f18267H0 = true;
        this.f18099a.m(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        Bundle bundle = abstractComponentCallbacksC1480v.f18286Z;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC1480v.f18286Z.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC1480v.f18286Z.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC1480v.f18287h0 = abstractComponentCallbacksC1480v.f18286Z.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC1480v.f18288i0 = abstractComponentCallbacksC1480v.f18286Z.getBundle("viewRegistryState");
        O o10 = (O) abstractComponentCallbacksC1480v.f18286Z.getParcelable("state");
        if (o10 != null) {
            abstractComponentCallbacksC1480v.f18292m0 = o10.f18096q0;
            abstractComponentCallbacksC1480v.f18293n0 = o10.f18097r0;
            abstractComponentCallbacksC1480v.f18271L0 = o10.f18098s0;
        }
        if (!abstractComponentCallbacksC1480v.f18271L0) {
            abstractComponentCallbacksC1480v.f18270K0 = true;
        }
    }

    public final void n() {
        View view;
        String str;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC1480v);
        }
        C1479u c1479u = abstractComponentCallbacksC1480v.f18272M0;
        if (c1479u == null) {
            view = null;
        } else {
            view = c1479u.f18258m;
        }
        if (view != null) {
            if (view != abstractComponentCallbacksC1480v.f18269J0) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC1480v.f18269J0) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(view);
                sb2.append(Separators.SP);
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(abstractComponentCallbacksC1480v);
                sb2.append(" resulting in focused view ");
                sb2.append(abstractComponentCallbacksC1480v.f18269J0.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        abstractComponentCallbacksC1480v.j().f18258m = null;
        abstractComponentCallbacksC1480v.f18304y0.N();
        abstractComponentCallbacksC1480v.f18304y0.y(true);
        abstractComponentCallbacksC1480v.f18284Y = 7;
        abstractComponentCallbacksC1480v.f18267H0 = false;
        abstractComponentCallbacksC1480v.E();
        if (abstractComponentCallbacksC1480v.f18267H0) {
            C2088x c2088x = abstractComponentCallbacksC1480v.f18278S0;
            EnumC2081p enumC2081p = EnumC2081p.ON_RESUME;
            c2088x.k(enumC2081p);
            if (abstractComponentCallbacksC1480v.f18269J0 != null) {
                abstractComponentCallbacksC1480v.f18279T0.d(enumC2081p);
            }
            K k10 = abstractComponentCallbacksC1480v.f18304y0;
            k10.f18035F = false;
            k10.f18036G = false;
            k10.f18042M.f18084i = false;
            k10.t(7);
            this.f18099a.p(false);
            this.f18100b.J(null, abstractComponentCallbacksC1480v.f18289j0);
            abstractComponentCallbacksC1480v.f18286Z = null;
            abstractComponentCallbacksC1480v.f18287h0 = null;
            abstractComponentCallbacksC1480v.f18288i0 = null;
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onResume()");
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (abstractComponentCallbacksC1480v.f18284Y == -1 && (bundle = abstractComponentCallbacksC1480v.f18286Z) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new O(abstractComponentCallbacksC1480v));
        if (abstractComponentCallbacksC1480v.f18284Y > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC1480v.F(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f18099a.q(false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC1480v.f18282W0.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle U10 = abstractComponentCallbacksC1480v.f18304y0.U();
            if (!U10.isEmpty()) {
                bundle2.putBundle("childFragmentManager", U10);
            }
            if (abstractComponentCallbacksC1480v.f18269J0 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC1480v.f18287h0;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC1480v.f18288i0;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC1480v.f18290k0;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (abstractComponentCallbacksC1480v.f18269J0 == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC1480v + " with view " + abstractComponentCallbacksC1480v.f18269J0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC1480v.f18269J0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC1480v.f18287h0 = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC1480v.f18279T0.f18155k0.c(bundle);
        if (!bundle.isEmpty()) {
            abstractComponentCallbacksC1480v.f18288i0 = bundle;
        }
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC1480v);
        }
        abstractComponentCallbacksC1480v.f18304y0.N();
        abstractComponentCallbacksC1480v.f18304y0.y(true);
        abstractComponentCallbacksC1480v.f18284Y = 5;
        abstractComponentCallbacksC1480v.f18267H0 = false;
        abstractComponentCallbacksC1480v.G();
        if (abstractComponentCallbacksC1480v.f18267H0) {
            C2088x c2088x = abstractComponentCallbacksC1480v.f18278S0;
            EnumC2081p enumC2081p = EnumC2081p.ON_START;
            c2088x.k(enumC2081p);
            if (abstractComponentCallbacksC1480v.f18269J0 != null) {
                abstractComponentCallbacksC1480v.f18279T0.d(enumC2081p);
            }
            K k10 = abstractComponentCallbacksC1480v.f18304y0;
            k10.f18035F = false;
            k10.f18036G = false;
            k10.f18042M.f18084i = false;
            k10.t(5);
            this.f18099a.r(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onStart()");
    }

    public final void r() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18101c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC1480v);
        }
        K k10 = abstractComponentCallbacksC1480v.f18304y0;
        k10.f18036G = true;
        k10.f18042M.f18084i = true;
        k10.t(4);
        if (abstractComponentCallbacksC1480v.f18269J0 != null) {
            abstractComponentCallbacksC1480v.f18279T0.d(EnumC2081p.ON_STOP);
        }
        abstractComponentCallbacksC1480v.f18278S0.k(EnumC2081p.ON_STOP);
        abstractComponentCallbacksC1480v.f18284Y = 4;
        abstractComponentCallbacksC1480v.f18267H0 = false;
        abstractComponentCallbacksC1480v.H();
        if (abstractComponentCallbacksC1480v.f18267H0) {
            this.f18099a.s(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC1480v + " did not call through to super.onStop()");
    }

    public P(U3.e eVar, U3.i iVar, ClassLoader classLoader, E e10, Bundle bundle) {
        this.f18099a = eVar;
        this.f18100b = iVar;
        O o10 = (O) bundle.getParcelable("state");
        AbstractComponentCallbacksC1480v a5 = e10.a(o10.f18085Y);
        a5.f18289j0 = o10.f18086Z;
        a5.f18297r0 = o10.f18087h0;
        a5.f18299t0 = true;
        a5.f18260A0 = o10.f18088i0;
        a5.f18261B0 = o10.f18089j0;
        a5.f18262C0 = o10.f18090k0;
        a5.f18265F0 = o10.f18091l0;
        a5.f18296q0 = o10.f18092m0;
        a5.f18264E0 = o10.f18093n0;
        a5.f18263D0 = o10.f18094o0;
        a5.f18277R0 = EnumC2082q.values()[o10.f18095p0];
        a5.f18292m0 = o10.f18096q0;
        a5.f18293n0 = o10.f18097r0;
        a5.f18271L0 = o10.f18098s0;
        this.f18101c = a5;
        a5.f18286Z = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a5.N(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a5);
        }
    }

    public P(U3.e eVar, U3.i iVar, AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, Bundle bundle) {
        this.f18099a = eVar;
        this.f18100b = iVar;
        this.f18101c = abstractComponentCallbacksC1480v;
        abstractComponentCallbacksC1480v.f18287h0 = null;
        abstractComponentCallbacksC1480v.f18288i0 = null;
        abstractComponentCallbacksC1480v.f18301v0 = 0;
        abstractComponentCallbacksC1480v.f18298s0 = false;
        abstractComponentCallbacksC1480v.f18295p0 = false;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = abstractComponentCallbacksC1480v.f18291l0;
        abstractComponentCallbacksC1480v.f18292m0 = abstractComponentCallbacksC1480v2 != null ? abstractComponentCallbacksC1480v2.f18289j0 : null;
        abstractComponentCallbacksC1480v.f18291l0 = null;
        abstractComponentCallbacksC1480v.f18286Z = bundle;
        abstractComponentCallbacksC1480v.f18290k0 = bundle.getBundle("arguments");
    }
}

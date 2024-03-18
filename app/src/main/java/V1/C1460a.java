package V1;

import android.gov.nist.core.Separators;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: V1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460a implements I {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f18132a;

    /* renamed from: b  reason: collision with root package name */
    public int f18133b;

    /* renamed from: c  reason: collision with root package name */
    public int f18134c;

    /* renamed from: d  reason: collision with root package name */
    public int f18135d;

    /* renamed from: e  reason: collision with root package name */
    public int f18136e;

    /* renamed from: f  reason: collision with root package name */
    public int f18137f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18138g;

    /* renamed from: h  reason: collision with root package name */
    public String f18139h;

    /* renamed from: i  reason: collision with root package name */
    public int f18140i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f18141j;

    /* renamed from: k  reason: collision with root package name */
    public int f18142k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f18143l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f18144m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f18145n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18146o;

    /* renamed from: p  reason: collision with root package name */
    public final K f18147p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f18148q;

    /* renamed from: r  reason: collision with root package name */
    public int f18149r;

    public C1460a(K k10) {
        k10.E();
        C1482x c1482x = k10.f18064u;
        if (c1482x != null) {
            c1482x.f18309Z.getClassLoader();
        }
        this.f18132a = new ArrayList();
        this.f18146o = false;
        this.f18149r = -1;
        this.f18147p = k10;
    }

    @Override // V1.I
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f18138g) {
            K k10 = this.f18147p;
            if (k10.f18047d == null) {
                k10.f18047d = new ArrayList();
            }
            k10.f18047d.add(this);
            return true;
        }
        return true;
    }

    public final void b(Q q10) {
        this.f18132a.add(q10);
        q10.f18107d = this.f18133b;
        q10.f18108e = this.f18134c;
        q10.f18109f = this.f18135d;
        q10.f18110g = this.f18136e;
    }

    public final void c(int i10) {
        Q q10;
        if (!this.f18138g) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        int size = this.f18132a.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((Q) this.f18132a.get(i11)).f18105b;
            if (abstractComponentCallbacksC1480v != null) {
                abstractComponentCallbacksC1480v.f18301v0 += i10;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Bump nesting of " + q10.f18105b + " to " + q10.f18105b.f18301v0);
                }
            }
        }
    }

    public final int d(boolean z10) {
        if (!this.f18148q) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b0());
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.f18148q = true;
            boolean z11 = this.f18138g;
            K k10 = this.f18147p;
            if (z11) {
                this.f18149r = k10.f18052i.getAndIncrement();
            } else {
                this.f18149r = -1;
            }
            k10.w(this, z10);
            return this.f18149r;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e(int i10, AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, String str, int i11) {
        String str2 = abstractComponentCallbacksC1480v.f18276Q0;
        if (str2 != null) {
            W1.c.d(abstractComponentCallbacksC1480v, str2);
        }
        Class<?> cls = abstractComponentCallbacksC1480v.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = abstractComponentCallbacksC1480v.f18262C0;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC1480v + ": was " + abstractComponentCallbacksC1480v.f18262C0 + " now " + str);
                }
                abstractComponentCallbacksC1480v.f18262C0 = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = abstractComponentCallbacksC1480v.f18260A0;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC1480v + ": was " + abstractComponentCallbacksC1480v.f18260A0 + " now " + i10);
                    }
                    abstractComponentCallbacksC1480v.f18260A0 = i10;
                    abstractComponentCallbacksC1480v.f18261B0 = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC1480v + " with tag " + str + " to container view with no id");
                }
            }
            b(new Q(i11, abstractComponentCallbacksC1480v));
            abstractComponentCallbacksC1480v.f18302w0 = this.f18147p;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void f(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f18139h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f18149r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f18148q);
            if (this.f18137f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f18137f));
            }
            if (this.f18133b != 0 || this.f18134c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18133b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18134c));
            }
            if (this.f18135d != 0 || this.f18136e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18135d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18136e));
            }
            if (this.f18140i != 0 || this.f18141j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18140i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f18141j);
            }
            if (this.f18142k != 0 || this.f18143l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18142k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f18143l);
            }
        }
        if (!this.f18132a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f18132a.size();
            for (int i10 = 0; i10 < size; i10++) {
                Q q10 = (Q) this.f18132a.get(i10);
                switch (q10.f18104a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + q10.f18104a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(Separators.SP);
                printWriter.println(q10.f18105b);
                if (z10) {
                    if (q10.f18107d != 0 || q10.f18108e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(q10.f18107d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(q10.f18108e));
                    }
                    if (q10.f18109f != 0 || q10.f18110g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(q10.f18109f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(q10.f18110g));
                    }
                }
            }
        }
    }

    public final void g(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        K k10 = abstractComponentCallbacksC1480v.f18302w0;
        if (k10 != null && k10 != this.f18147p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1480v.toString() + " is already attached to a FragmentManager.");
        }
        b(new Q(3, abstractComponentCallbacksC1480v));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f18149r >= 0) {
            sb2.append(" #");
            sb2.append(this.f18149r);
        }
        if (this.f18139h != null) {
            sb2.append(Separators.SP);
            sb2.append(this.f18139h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}

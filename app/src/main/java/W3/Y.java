package w3;

import android.gov.nist.core.Separators;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: s  reason: collision with root package name */
    public static final List f47799s = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final View f47800a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f47801b;

    /* renamed from: j  reason: collision with root package name */
    public int f47809j;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f47817r;

    /* renamed from: c  reason: collision with root package name */
    public int f47802c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f47803d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f47804e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f47805f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f47806g = -1;

    /* renamed from: h  reason: collision with root package name */
    public Y f47807h = null;

    /* renamed from: i  reason: collision with root package name */
    public Y f47808i = null;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f47810k = null;

    /* renamed from: l  reason: collision with root package name */
    public List f47811l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f47812m = 0;

    /* renamed from: n  reason: collision with root package name */
    public i3.g f47813n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f47814o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f47815p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f47816q = -1;

    public Y(View view) {
        if (view != null) {
            this.f47800a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((1024 & this.f47809j) == 0) {
            if (this.f47810k == null) {
                ArrayList arrayList = new ArrayList();
                this.f47810k = arrayList;
                this.f47811l = Collections.unmodifiableList(arrayList);
            }
            this.f47810k.add(obj);
        }
    }

    public final void b(int i10) {
        this.f47809j = i10 | this.f47809j;
    }

    public final int c() {
        int i10 = this.f47806g;
        if (i10 == -1) {
            return this.f47802c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        int i10 = this.f47809j & 1024;
        List list = f47799s;
        if (i10 == 0 && (arrayList = this.f47810k) != null && arrayList.size() != 0) {
            return this.f47811l;
        }
        return list;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f47809j) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f47800a;
        if (view.getParent() != null && view.getParent() != this.f47817r) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f47809j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f47809j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f47809j & 16) == 0) {
            WeakHashMap weakHashMap = D1.Z.f3247a;
            if (!D1.H.i(this.f47800a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if ((this.f47809j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f47813n != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f47809j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f47809j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.f47803d == -1) {
            this.f47803d = this.f47802c;
        }
        if (this.f47806g == -1) {
            this.f47806g = this.f47802c;
        }
        if (z10) {
            this.f47806g += i10;
        }
        this.f47802c += i10;
        View view = this.f47800a;
        if (view.getLayoutParams() != null) {
            ((L) view.getLayoutParams()).f47769c = true;
        }
    }

    public final void o() {
        this.f47809j = 0;
        this.f47802c = -1;
        this.f47803d = -1;
        this.f47804e = -1L;
        this.f47806g = -1;
        this.f47812m = 0;
        this.f47807h = null;
        this.f47808i = null;
        ArrayList arrayList = this.f47810k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f47809j &= -1025;
        this.f47815p = 0;
        this.f47816q = -1;
        RecyclerView.j(this);
    }

    public final void p(boolean z10) {
        int i10;
        int i11 = this.f47812m;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f47812m = i10;
        if (i10 < 0) {
            this.f47812m = 0;
            AbstractC3612c.c("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f47809j |= 16;
        } else if (z10 && i10 == 0) {
            this.f47809j &= -17;
        }
    }

    public final boolean q() {
        if ((this.f47809j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if ((this.f47809j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        if (getClass().isAnonymousClass()) {
            str = "ViewHolder";
        } else {
            str = getClass().getSimpleName();
        }
        StringBuilder r10 = android.gov.nist.core.a.r(str, "{");
        r10.append(Integer.toHexString(hashCode()));
        r10.append(" position=");
        r10.append(this.f47802c);
        r10.append(" id=");
        r10.append(this.f47804e);
        r10.append(", oldPos=");
        r10.append(this.f47803d);
        r10.append(", pLpos:");
        r10.append(this.f47806g);
        StringBuilder sb2 = new StringBuilder(r10.toString());
        if (k()) {
            sb2.append(" scrap ");
            if (this.f47814o) {
                str2 = "[changeScrap]";
            } else {
                str2 = "[attachedScrap]";
            }
            sb2.append(str2);
        }
        if (h()) {
            sb2.append(" invalid");
        }
        if (!g()) {
            sb2.append(" unbound");
        }
        if ((this.f47809j & 2) != 0) {
            sb2.append(" update");
        }
        if (j()) {
            sb2.append(" removed");
        }
        if (q()) {
            sb2.append(" ignored");
        }
        if (l()) {
            sb2.append(" tmpDetached");
        }
        if (!i()) {
            sb2.append(" not recyclable(" + this.f47812m + Separators.RPAREN);
        }
        if ((this.f47809j & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f47800a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}

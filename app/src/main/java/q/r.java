package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import f8.C2944a;
import java.util.List;
import java.util.WeakHashMap;
import l.AbstractC4308a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43536a;

    /* renamed from: b  reason: collision with root package name */
    public int f43537b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f43538c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f43539d;

    /* renamed from: e  reason: collision with root package name */
    public Object f43540e;

    /* renamed from: f  reason: collision with root package name */
    public Object f43541f;

    /* renamed from: g  reason: collision with root package name */
    public Object f43542g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(r rVar, Nh.k kVar, Nh.k kVar2) {
        this(kVar, kVar2, (Nh.k) rVar.f43540e, rVar.f43537b, (String) rVar.f43541f);
        this.f43536a = 4;
        this.f43542g = (r) rVar.f43542g;
    }

    public static r b(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        R4.b.S("Cannot create a CalendarItemStyle with a styleResId of 0", z10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, O7.a.f13414m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList L02 = A7.b.L0(context, obtainStyledAttributes, 4);
        ColorStateList L03 = A7.b.L0(context, obtainStyledAttributes, 9);
        ColorStateList L04 = A7.b.L0(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        f8.j a5 = f8.j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C2944a(0)).a();
        obtainStyledAttributes.recycle();
        return new r(L02, L03, L04, dimensionPixelSize, a5, rect);
    }

    public static r h(r rVar, Nh.k kVar, Nh.k kVar2) {
        int i10;
        if (rVar == null) {
            return null;
        }
        r h10 = h((r) rVar.f43542g, kVar, kVar2);
        rVar.f43542g = h10;
        Nh.k kVar3 = (Nh.k) rVar.f43538c;
        int i11 = kVar3.f13099d;
        Nh.k kVar4 = (Nh.k) rVar.f43539d;
        int i12 = kVar4.f13099d;
        int i13 = kVar.f13099d;
        if (kVar2 == null) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = kVar2.f13099d;
        }
        if (i13 < i12 && i10 > i11) {
            if (i13 <= i11) {
                if (i10 >= i12) {
                    return h10;
                }
                return new r(rVar, kVar2, kVar4);
            } else if (i10 >= i12) {
                return new r(rVar, kVar3, kVar);
            } else {
                rVar.f43542g = new r(rVar, kVar2, kVar4);
                return new r(rVar, kVar3, kVar);
            }
        }
        return rVar;
    }

    public final void a() {
        View view = (View) this.f43538c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((r1) this.f43540e) != null) {
                if (((r1) this.f43542g) == null) {
                    this.f43542g = new r1(0);
                }
                r1 r1Var = (r1) this.f43542g;
                r1Var.f43546d = null;
                r1Var.f43545c = false;
                r1Var.f43547e = null;
                r1Var.f43544b = false;
                WeakHashMap weakHashMap = D1.Z.f3247a;
                ColorStateList g10 = D1.N.g(view);
                if (g10 != null) {
                    r1Var.f43545c = true;
                    r1Var.f43546d = g10;
                }
                PorterDuff.Mode h10 = D1.N.h(view);
                if (h10 != null) {
                    r1Var.f43544b = true;
                    r1Var.f43547e = h10;
                }
                if (r1Var.f43545c || r1Var.f43544b) {
                    C5243x.e(background, r1Var, view.getDrawableState());
                    return;
                }
            }
            r1 r1Var2 = (r1) this.f43541f;
            if (r1Var2 != null) {
                C5243x.e(background, r1Var2, view.getDrawableState());
                return;
            }
            r1 r1Var3 = (r1) this.f43540e;
            if (r1Var3 != null) {
                C5243x.e(background, r1Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f43541f;
        if (((r1) obj) != null) {
            return (ColorStateList) ((r1) obj).f43546d;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f43541f;
        if (((r1) obj) != null) {
            return (PorterDuff.Mode) ((r1) obj).f43547e;
        }
        return null;
    }

    public final void e(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        Object obj = this.f43538c;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = AbstractC4308a.f37689z;
        U3.u I10 = U3.u.I(context, attributeSet, iArr, i10, 0);
        D1.Z.k(view, view.getContext(), iArr, attributeSet, (TypedArray) I10.f17493h0, i10);
        try {
            if (I10.E(0)) {
                this.f43537b = I10.z(0, -1);
                C5243x c5243x = (C5243x) this.f43539d;
                Context context2 = ((View) obj).getContext();
                int i12 = this.f43537b;
                synchronized (c5243x) {
                    i11 = c5243x.f43586a.i(context2, i12);
                }
                if (i11 != null) {
                    i(i11);
                }
            }
            if (I10.E(1)) {
                D1.N.q((View) obj, I10.p(1));
            }
            if (I10.E(2)) {
                D1.N.r((View) obj, AbstractC5238u0.b(I10.x(2, -1), null));
            }
            I10.N();
        } catch (Throwable th2) {
            I10.N();
            throw th2;
        }
    }

    public final void f() {
        this.f43537b = -1;
        i(null);
        a();
    }

    public final void g(int i10) {
        ColorStateList colorStateList;
        this.f43537b = i10;
        C5243x c5243x = (C5243x) this.f43539d;
        if (c5243x != null) {
            Context context = ((View) this.f43538c).getContext();
            synchronized (c5243x) {
                colorStateList = c5243x.f43586a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        i(colorStateList);
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((r1) this.f43540e) == null) {
                this.f43540e = new r1(0);
            }
            Object obj = this.f43540e;
            ((r1) obj).f43546d = colorStateList;
            ((r1) obj).f43545c = true;
        } else {
            this.f43540e = null;
        }
        a();
    }

    public final void j(ColorStateList colorStateList) {
        if (((r1) this.f43541f) == null) {
            this.f43541f = new r1(0);
        }
        r1 r1Var = (r1) this.f43541f;
        r1Var.f43546d = colorStateList;
        r1Var.f43545c = true;
        a();
    }

    public final void k(PorterDuff.Mode mode) {
        if (((r1) this.f43541f) == null) {
            this.f43541f = new r1(0);
        }
        r1 r1Var = (r1) this.f43541f;
        r1Var.f43547e = mode;
        r1Var.f43544b = true;
        a();
    }

    public final String toString() {
        switch (this.f43536a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FontRequest {mProviderAuthority: " + ((String) this.f43538c) + ", mProviderPackage: " + ((String) this.f43539d) + ", mQuery: " + ((String) this.f43540e) + ", mCertificates:");
                for (int i10 = 0; i10 < ((List) this.f43541f).size(); i10++) {
                    sb2.append(" [");
                    List list = (List) ((List) this.f43541f).get(i10);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        sb2.append(" \"");
                        sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                        sb2.append(Separators.DOUBLE_QUOTE);
                    }
                    sb2.append(" ]");
                }
                sb2.append("}");
                sb2.append("mCertificatesArray: " + this.f43537b);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public r(View view) {
        this.f43536a = 0;
        this.f43537b = -1;
        this.f43538c = view;
        this.f43539d = C5243x.a();
    }

    public r(String str, String str2, String str3, List list) {
        this.f43536a = 1;
        str.getClass();
        this.f43538c = str;
        str2.getClass();
        this.f43539d = str2;
        this.f43540e = str3;
        list.getClass();
        this.f43541f = list;
        this.f43537b = 0;
        this.f43542g = str + "-" + str2 + "-" + str3;
    }

    public r(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, f8.j jVar, Rect rect) {
        this.f43536a = 3;
        R4.b.T(rect.left);
        R4.b.T(rect.top);
        R4.b.T(rect.right);
        R4.b.T(rect.bottom);
        this.f43538c = rect;
        this.f43539d = colorStateList2;
        this.f43540e = colorStateList;
        this.f43541f = colorStateList3;
        this.f43537b = i10;
        this.f43542g = jVar;
    }

    public r(Nh.k kVar, Nh.k kVar2, Nh.k kVar3, int i10, String str) {
        this.f43536a = 4;
        this.f43538c = kVar;
        this.f43539d = kVar2;
        this.f43540e = kVar3;
        this.f43537b = i10;
        this.f43541f = str;
    }
}

package q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.openai.chatgpt.R;
import java.util.ArrayList;

/* renamed from: q.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5222m implements p.C {

    /* renamed from: A0  reason: collision with root package name */
    public C5214i f43451A0;

    /* renamed from: Y  reason: collision with root package name */
    public final Context f43453Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f43454Z;

    /* renamed from: h0  reason: collision with root package name */
    public p.o f43455h0;

    /* renamed from: i0  reason: collision with root package name */
    public final LayoutInflater f43456i0;

    /* renamed from: j0  reason: collision with root package name */
    public p.B f43457j0;

    /* renamed from: m0  reason: collision with root package name */
    public p.E f43460m0;

    /* renamed from: n0  reason: collision with root package name */
    public C5220l f43461n0;

    /* renamed from: o0  reason: collision with root package name */
    public Drawable f43462o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f43463p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f43464q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f43465r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f43466s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f43467t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f43468u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f43469v0;

    /* renamed from: x0  reason: collision with root package name */
    public C5212h f43471x0;

    /* renamed from: y0  reason: collision with root package name */
    public C5212h f43472y0;

    /* renamed from: z0  reason: collision with root package name */
    public RunnableC5216j f43473z0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f43458k0 = R.layout.abc_action_menu_layout;

    /* renamed from: l0  reason: collision with root package name */
    public final int f43459l0 = R.layout.abc_action_menu_item_layout;

    /* renamed from: w0  reason: collision with root package name */
    public final SparseBooleanArray f43470w0 = new SparseBooleanArray();

    /* renamed from: B0  reason: collision with root package name */
    public final J0.a f43452B0 = new J0.a(this);

    public C5222m(Context context) {
        this.f43453Y = context;
        this.f43456i0 = LayoutInflater.from(context);
    }

    public final View a(p.q qVar, View view, ViewGroup viewGroup) {
        p.D d10;
        View actionView = qVar.getActionView();
        int i10 = 0;
        if (actionView == null || qVar.e()) {
            if (view instanceof p.D) {
                d10 = (p.D) view;
            } else {
                d10 = (p.D) this.f43456i0.inflate(this.f43459l0, viewGroup, false);
            }
            d10.b(qVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) d10;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f43460m0);
            if (this.f43451A0 == null) {
                this.f43451A0 = new C5214i(this);
            }
            actionMenuItemView.setPopupCallback(this.f43451A0);
            actionView = (View) d10;
        }
        if (qVar.f41634C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C5226o)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // p.C
    public final void b(p.o oVar, boolean z10) {
        f();
        C5212h c5212h = this.f43472y0;
        if (c5212h != null && c5212h.b()) {
            c5212h.f41506j.dismiss();
        }
        p.B b10 = this.f43457j0;
        if (b10 != null) {
            b10.b(oVar, z10);
        }
    }

    @Override // p.C
    public final void c(Context context, p.o oVar) {
        this.f43454Z = context;
        LayoutInflater.from(context);
        this.f43455h0 = oVar;
        Resources resources = context.getResources();
        if (!this.f43465r0) {
            this.f43464q0 = true;
        }
        int i10 = 2;
        this.f43466s0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
            if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                if (i11 >= 360) {
                    i10 = 3;
                }
            } else {
                i10 = 4;
            }
        } else {
            i10 = 5;
        }
        this.f43468u0 = i10;
        int i13 = this.f43466s0;
        if (this.f43464q0) {
            if (this.f43461n0 == null) {
                C5220l c5220l = new C5220l(this, this.f43453Y);
                this.f43461n0 = c5220l;
                if (this.f43463p0) {
                    c5220l.setImageDrawable(this.f43462o0);
                    this.f43462o0 = null;
                    this.f43463p0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f43461n0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f43461n0.getMeasuredWidth();
        } else {
            this.f43461n0 = null;
        }
        this.f43467t0 = i13;
        float f6 = resources.getDisplayMetrics().density;
    }

    @Override // p.C
    public final boolean d() {
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        p.o oVar = this.f43455h0;
        if (oVar != null) {
            arrayList = oVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = this.f43468u0;
        int i13 = this.f43467t0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f43460m0;
        int i14 = 0;
        boolean z14 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            p.q qVar = (p.q) arrayList.get(i14);
            int i17 = qVar.f41659y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z14 = true;
            }
            if (this.f43469v0 && qVar.f41634C) {
                i12 = 0;
            }
            i14++;
        }
        if (this.f43464q0 && (z14 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = this.f43470w0;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            p.q qVar2 = (p.q) arrayList.get(i19);
            int i21 = qVar2.f41659y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i22 = qVar2.f41636b;
            if (z11) {
                View a5 = a(qVar2, null, viewGroup);
                a5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a5.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                qVar2.g(z10);
            } else if ((i21 & 1) == z10) {
                boolean z15 = sparseBooleanArray.get(i22);
                if ((i18 > 0 || z15) && i13 > 0) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    View a10 = a(qVar2, null, viewGroup);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    if (i13 + i20 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z12 &= z13;
                }
                if (z12 && i22 != 0) {
                    sparseBooleanArray.put(i22, true);
                } else if (z15) {
                    sparseBooleanArray.put(i22, false);
                    for (int i23 = 0; i23 < i19; i23++) {
                        p.q qVar3 = (p.q) arrayList.get(i23);
                        if (qVar3.f41636b == i22) {
                            if (qVar3.f()) {
                                i18++;
                            }
                            qVar3.g(false);
                        }
                    }
                }
                if (z12) {
                    i18--;
                }
                qVar2.g(z12);
            } else {
                qVar2.g(false);
                i19++;
                i11 = 2;
                z10 = true;
            }
            i19++;
            i11 = 2;
            z10 = true;
        }
        return z10;
    }

    @Override // p.C
    public final void e(p.B b10) {
        this.f43457j0 = b10;
    }

    public final boolean f() {
        p.E e10;
        RunnableC5216j runnableC5216j = this.f43473z0;
        if (runnableC5216j != null && (e10 = this.f43460m0) != null) {
            ((View) e10).removeCallbacks(runnableC5216j);
            this.f43473z0 = null;
            return true;
        }
        C5212h c5212h = this.f43471x0;
        if (c5212h != null) {
            if (c5212h.b()) {
                c5212h.f41506j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // p.C
    public final void g() {
        int size;
        int i10;
        p.q qVar;
        ViewGroup viewGroup = (ViewGroup) this.f43460m0;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            p.o oVar = this.f43455h0;
            if (oVar != null) {
                oVar.i();
                ArrayList l10 = this.f43455h0.l();
                int size2 = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    p.q qVar2 = (p.q) l10.get(i11);
                    if (qVar2.f()) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof p.D) {
                            qVar = ((p.D) childAt).getItemData();
                        } else {
                            qVar = null;
                        }
                        View a5 = a(qVar2, childAt, viewGroup);
                        if (qVar2 != qVar) {
                            a5.setPressed(false);
                            a5.jumpDrawablesToCurrentState();
                        }
                        if (a5 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a5.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a5);
                            }
                            ((ViewGroup) this.f43460m0).addView(a5, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f43461n0) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f43460m0).requestLayout();
        p.o oVar2 = this.f43455h0;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f41613i;
            int size3 = arrayList2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                p.r rVar = ((p.q) arrayList2.get(i12)).f41632A;
            }
        }
        p.o oVar3 = this.f43455h0;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f41614j;
        }
        if (this.f43464q0 && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((p.q) arrayList.get(0)).f41634C))) {
            if (this.f43461n0 == null) {
                this.f43461n0 = new C5220l(this, this.f43453Y);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f43461n0.getParent();
            if (viewGroup3 != this.f43460m0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f43461n0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f43460m0;
                C5220l c5220l = this.f43461n0;
                actionMenuView.getClass();
                C5226o l11 = ActionMenuView.l();
                l11.f43485a = true;
                actionMenuView.addView(c5220l, l11);
            }
        } else {
            C5220l c5220l2 = this.f43461n0;
            if (c5220l2 != null) {
                ViewParent parent = c5220l2.getParent();
                p.E e10 = this.f43460m0;
                if (parent == e10) {
                    ((ViewGroup) e10).removeView(this.f43461n0);
                }
            }
        }
        ((ActionMenuView) this.f43460m0).setOverflowReserved(this.f43464q0);
    }

    public final boolean h() {
        C5212h c5212h = this.f43471x0;
        if (c5212h != null && c5212h.b()) {
            return true;
        }
        return false;
    }

    @Override // p.C
    public final boolean i(p.I i10) {
        boolean z10;
        if (!i10.hasVisibleItems()) {
            return false;
        }
        p.I i11 = i10;
        while (true) {
            p.o oVar = i11.f41531z;
            if (oVar == this.f43455h0) {
                break;
            }
            i11 = (p.I) oVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f43460m0;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i12);
                if ((childAt instanceof p.D) && ((p.D) childAt).getItemData() == i11.f41530A) {
                    view = childAt;
                    break;
                }
                i12++;
            }
        }
        if (view == null) {
            return false;
        }
        i10.f41530A.getClass();
        int size = i10.f41610f.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                MenuItem item = i10.getItem(i13);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i13++;
            } else {
                z10 = false;
                break;
            }
        }
        C5212h c5212h = new C5212h(this, this.f43454Z, i10, view);
        this.f43472y0 = c5212h;
        c5212h.f41504h = z10;
        p.x xVar = c5212h.f41506j;
        if (xVar != null) {
            xVar.o(z10);
        }
        C5212h c5212h2 = this.f43472y0;
        if (!c5212h2.b()) {
            if (c5212h2.f41502f != null) {
                c5212h2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        p.B b10 = this.f43457j0;
        if (b10 != null) {
            b10.A(i10);
        }
        return true;
    }

    @Override // p.C
    public final /* bridge */ /* synthetic */ boolean j(p.q qVar) {
        return false;
    }

    @Override // p.C
    public final /* bridge */ /* synthetic */ boolean k(p.q qVar) {
        return false;
    }

    public final boolean l() {
        p.o oVar;
        if (this.f43464q0 && !h() && (oVar = this.f43455h0) != null && this.f43460m0 != null && this.f43473z0 == null) {
            oVar.i();
            if (!oVar.f41614j.isEmpty()) {
                RunnableC5216j runnableC5216j = new RunnableC5216j(this, 0, new C5212h(this, this.f43454Z, this.f43455h0, this.f43461n0));
                this.f43473z0 = runnableC5216j;
                ((View) this.f43460m0).post(runnableC5216j);
                return true;
            }
        }
        return false;
    }
}

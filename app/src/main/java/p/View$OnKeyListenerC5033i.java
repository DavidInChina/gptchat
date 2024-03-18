package p;

import D1.Z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.A0;
import q.N0;
import q.P0;
import q.Q0;
import q.T0;

/* renamed from: p.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC5033i extends x implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B0  reason: collision with root package name */
    public boolean f41565B0;

    /* renamed from: C0  reason: collision with root package name */
    public B f41566C0;

    /* renamed from: D0  reason: collision with root package name */
    public ViewTreeObserver f41567D0;

    /* renamed from: E0  reason: collision with root package name */
    public PopupWindow.OnDismissListener f41568E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f41569F0;

    /* renamed from: Z  reason: collision with root package name */
    public final Context f41570Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f41571h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f41572i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f41573j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f41574k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Handler f41575l0;

    /* renamed from: t0  reason: collision with root package name */
    public View f41583t0;

    /* renamed from: u0  reason: collision with root package name */
    public View f41584u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f41585v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f41586w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f41587x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f41588y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f41589z0;

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f41576m0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f41577n0 = new ArrayList();

    /* renamed from: o0  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC5029e f41578o0 = new ViewTreeObserver$OnGlobalLayoutListenerC5029e(0, this);

    /* renamed from: p0  reason: collision with root package name */
    public final View$OnAttachStateChangeListenerC5030f f41579p0 = new View$OnAttachStateChangeListenerC5030f(0, this);

    /* renamed from: q0  reason: collision with root package name */
    public final J0.a f41580q0 = new J0.a(this);

    /* renamed from: r0  reason: collision with root package name */
    public int f41581r0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    public int f41582s0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f41564A0 = false;

    public View$OnKeyListenerC5033i(Context context, View view, int i10, int i11, boolean z10) {
        int i12 = 0;
        this.f41570Z = context;
        this.f41583t0 = view;
        this.f41572i0 = i10;
        this.f41573j0 = i11;
        this.f41574k0 = z10;
        WeakHashMap weakHashMap = Z.f3247a;
        this.f41585v0 = D1.I.d(view) != 1 ? 1 : i12;
        Resources resources = context.getResources();
        this.f41571h0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f41575l0 = new Handler();
    }

    @Override // p.G
    public final boolean a() {
        ArrayList arrayList = this.f41577n0;
        if (arrayList.size() <= 0 || !((C5032h) arrayList.get(0)).f41561a.f43320E0.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // p.C
    public final void b(o oVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f41577n0;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (oVar == ((C5032h) arrayList.get(i11)).f41562b) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((C5032h) arrayList.get(i12)).f41562b.c(false);
        }
        C5032h c5032h = (C5032h) arrayList.remove(i11);
        c5032h.f41562b.r(this);
        boolean z11 = this.f41569F0;
        T0 t02 = c5032h.f41561a;
        if (z11) {
            P0.b(t02.f43320E0, null);
            t02.f43320E0.setAnimationStyle(0);
        }
        t02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f41585v0 = ((C5032h) arrayList.get(size2 - 1)).f41563c;
        } else {
            View view = this.f41583t0;
            WeakHashMap weakHashMap = Z.f3247a;
            if (D1.I.d(view) == 1) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f41585v0 = i10;
        }
        if (size2 == 0) {
            dismiss();
            B b10 = this.f41566C0;
            if (b10 != null) {
                b10.b(oVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.f41567D0;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f41567D0.removeGlobalOnLayoutListener(this.f41578o0);
                }
                this.f41567D0 = null;
            }
            this.f41584u0.removeOnAttachStateChangeListener(this.f41579p0);
            this.f41568E0.onDismiss();
        } else if (z10) {
            ((C5032h) arrayList.get(0)).f41562b.c(false);
        }
    }

    @Override // p.C
    public final boolean d() {
        return false;
    }

    @Override // p.G
    public final void dismiss() {
        ArrayList arrayList = this.f41577n0;
        int size = arrayList.size();
        if (size > 0) {
            C5032h[] c5032hArr = (C5032h[]) arrayList.toArray(new C5032h[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C5032h c5032h = c5032hArr[i10];
                if (c5032h.f41561a.f43320E0.isShowing()) {
                    c5032h.f41561a.dismiss();
                }
            }
        }
    }

    @Override // p.C
    public final void e(B b10) {
        this.f41566C0 = b10;
    }

    @Override // p.G
    public final void f() {
        boolean z10;
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f41576m0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((o) it.next());
        }
        arrayList.clear();
        View view = this.f41583t0;
        this.f41584u0 = view;
        if (view != null) {
            if (this.f41567D0 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f41567D0 = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f41578o0);
            }
            this.f41584u0.addOnAttachStateChangeListener(this.f41579p0);
        }
    }

    @Override // p.C
    public final void g() {
        Iterator it = this.f41577n0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C5032h) it.next()).f41561a.f43323h0.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // p.G
    public final A0 h() {
        ArrayList arrayList = this.f41577n0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C5032h) arrayList.get(arrayList.size() - 1)).f41561a.f43323h0;
    }

    @Override // p.C
    public final boolean i(I i10) {
        Iterator it = this.f41577n0.iterator();
        while (it.hasNext()) {
            C5032h c5032h = (C5032h) it.next();
            if (i10 == c5032h.f41562b) {
                c5032h.f41561a.f43323h0.requestFocus();
                return true;
            }
        }
        if (i10.hasVisibleItems()) {
            l(i10);
            B b10 = this.f41566C0;
            if (b10 != null) {
                b10.A(i10);
            }
            return true;
        }
        return false;
    }

    @Override // p.x
    public final void l(o oVar) {
        oVar.b(this, this.f41570Z);
        if (a()) {
            v(oVar);
        } else {
            this.f41576m0.add(oVar);
        }
    }

    @Override // p.x
    public final void n(View view) {
        if (this.f41583t0 != view) {
            this.f41583t0 = view;
            int i10 = this.f41581r0;
            WeakHashMap weakHashMap = Z.f3247a;
            this.f41582s0 = Gravity.getAbsoluteGravity(i10, D1.I.d(view));
        }
    }

    @Override // p.x
    public final void o(boolean z10) {
        this.f41564A0 = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C5032h c5032h;
        ArrayList arrayList = this.f41577n0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                c5032h = (C5032h) arrayList.get(i10);
                if (!c5032h.f41561a.f43320E0.isShowing()) {
                    break;
                }
                i10++;
            } else {
                c5032h = null;
                break;
            }
        }
        if (c5032h != null) {
            c5032h.f41562b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // p.x
    public final void p(int i10) {
        if (this.f41581r0 != i10) {
            this.f41581r0 = i10;
            View view = this.f41583t0;
            WeakHashMap weakHashMap = Z.f3247a;
            this.f41582s0 = Gravity.getAbsoluteGravity(i10, D1.I.d(view));
        }
    }

    @Override // p.x
    public final void q(int i10) {
        this.f41586w0 = true;
        this.f41588y0 = i10;
    }

    @Override // p.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f41568E0 = onDismissListener;
    }

    @Override // p.x
    public final void s(boolean z10) {
        this.f41565B0 = z10;
    }

    @Override // p.x
    public final void t(int i10) {
        this.f41587x0 = true;
        this.f41589z0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Type inference failed for: r7v0, types: [q.N0, q.T0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(o oVar) {
        View view;
        C5032h c5032h;
        Rect rect;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        char c10;
        MenuItem menuItem;
        int i14;
        l lVar;
        int firstVisiblePosition;
        Context context = this.f41570Z;
        LayoutInflater from = LayoutInflater.from(context);
        l lVar2 = new l(oVar, from, this.f41574k0, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f41564A0) {
            lVar2.f41600h0 = true;
        } else if (a()) {
            lVar2.f41600h0 = x.u(oVar);
        }
        int m10 = x.m(lVar2, context, this.f41571h0);
        ?? n02 = new N0(context, null, this.f41572i0, this.f41573j0);
        n02.f43360I0 = this.f41580q0;
        n02.f43336u0 = this;
        n02.f43320E0.setOnDismissListener(this);
        n02.f43335t0 = this.f41583t0;
        n02.f43332q0 = this.f41582s0;
        n02.f43319D0 = true;
        n02.f43320E0.setFocusable(true);
        n02.f43320E0.setInputMethodMode(2);
        n02.o(lVar2);
        n02.q(m10);
        n02.f43332q0 = this.f41582s0;
        ArrayList arrayList = this.f41577n0;
        if (arrayList.size() > 0) {
            c5032h = (C5032h) arrayList.get(arrayList.size() - 1);
            o oVar2 = c5032h.f41562b;
            int size = oVar2.f41610f.size();
            int i15 = 0;
            while (true) {
                if (i15 < size) {
                    menuItem = oVar2.getItem(i15);
                    if (menuItem.hasSubMenu() && oVar == menuItem.getSubMenu()) {
                        break;
                    }
                    i15++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                A0 a02 = c5032h.f41561a.f43323h0;
                ListAdapter adapter = a02.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i14 = headerViewListAdapter.getHeadersCount();
                    lVar = (l) headerViewListAdapter.getWrappedAdapter();
                } else {
                    lVar = (l) adapter;
                    i14 = 0;
                }
                int count = lVar.getCount();
                int i16 = 0;
                while (true) {
                    if (i16 < count) {
                        if (menuItem == lVar.getItem(i16)) {
                            break;
                        }
                        i16++;
                    } else {
                        i16 = -1;
                        break;
                    }
                }
                if (i16 != -1 && (firstVisiblePosition = (i16 + i14) - a02.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a02.getChildCount()) {
                    view = a02.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i17 = Build.VERSION.SDK_INT;
                q.F f6 = n02.f43320E0;
                if (i17 <= 28) {
                    Method method = T0.f43359J0;
                    if (method != null) {
                        try {
                            method.invoke(f6, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    Q0.a(f6, false);
                }
                P0.a(n02.f43320E0, null);
                A0 a03 = ((C5032h) arrayList.get(arrayList.size() - 1)).f41561a.f43323h0;
                int[] iArr = new int[2];
                a03.getLocationOnScreen(iArr);
                Rect rect2 = new Rect();
                this.f41584u0.getWindowVisibleDisplayFrame(rect2);
                if (this.f41585v0 == 1) {
                    if (a03.getWidth() + iArr[0] + m10 > rect2.right) {
                        i10 = 0;
                        if (i10 != 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f41585v0 = i10;
                        if (Build.VERSION.SDK_INT < 26) {
                            n02.f43335t0 = view;
                            i12 = 0;
                            i11 = 0;
                        } else {
                            int[] iArr2 = new int[2];
                            this.f41583t0.getLocationOnScreen(iArr2);
                            int[] iArr3 = new int[2];
                            view.getLocationOnScreen(iArr3);
                            if ((this.f41582s0 & 7) == 5) {
                                c10 = 0;
                                iArr2[0] = this.f41583t0.getWidth() + iArr2[0];
                                iArr3[0] = view.getWidth() + iArr3[0];
                            } else {
                                c10 = 0;
                            }
                            i11 = iArr3[c10] - iArr2[c10];
                            i12 = iArr3[1] - iArr2[1];
                        }
                        if ((this.f41582s0 & 5) != 5) {
                            if (z10) {
                                i13 = i11 + m10;
                                n02.f43326k0 = i13;
                                n02.f43331p0 = true;
                                n02.f43330o0 = true;
                                n02.k(i12);
                            } else {
                                m10 = view.getWidth();
                                i13 = i11 - m10;
                                n02.f43326k0 = i13;
                                n02.f43331p0 = true;
                                n02.f43330o0 = true;
                                n02.k(i12);
                            }
                        } else {
                            if (z10) {
                                i13 = i11 + view.getWidth();
                                n02.f43326k0 = i13;
                                n02.f43331p0 = true;
                                n02.f43330o0 = true;
                                n02.k(i12);
                            }
                            i13 = i11 - m10;
                            n02.f43326k0 = i13;
                            n02.f43331p0 = true;
                            n02.f43330o0 = true;
                            n02.k(i12);
                        }
                    }
                    i10 = 1;
                    if (i10 != 1) {
                    }
                    this.f41585v0 = i10;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f41582s0 & 5) != 5) {
                    }
                } else {
                    if (iArr[0] - m10 >= 0) {
                        i10 = 0;
                        if (i10 != 1) {
                        }
                        this.f41585v0 = i10;
                        if (Build.VERSION.SDK_INT < 26) {
                        }
                        if ((this.f41582s0 & 5) != 5) {
                        }
                    }
                    i10 = 1;
                    if (i10 != 1) {
                    }
                    this.f41585v0 = i10;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f41582s0 & 5) != 5) {
                    }
                }
            } else {
                if (this.f41586w0) {
                    n02.f43326k0 = this.f41588y0;
                }
                if (this.f41587x0) {
                    n02.k(this.f41589z0);
                }
                Rect rect3 = this.f41671Y;
                if (rect3 != null) {
                    rect = new Rect(rect3);
                } else {
                    rect = null;
                }
                n02.f43318C0 = rect;
            }
            arrayList.add(new C5032h(n02, oVar, this.f41585v0));
            n02.f();
            A0 a04 = n02.f43323h0;
            a04.setOnKeyListener(this);
            if (c5032h != null && this.f41565B0 && oVar.f41617m != null) {
                FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) a04, false);
                frameLayout.setEnabled(false);
                ((TextView) frameLayout.findViewById(16908310)).setText(oVar.f41617m);
                a04.addHeaderView(frameLayout, null, false);
                n02.f();
                return;
            }
            return;
        }
        c5032h = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C5032h(n02, oVar, this.f41585v0));
        n02.f();
        A0 a042 = n02.f43323h0;
        a042.setOnKeyListener(this);
        if (c5032h != null) {
        }
    }
}

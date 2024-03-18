package com.google.android.material.datepicker;

import D1.AbstractC0362l0;
import D1.AbstractC0364m0;
import D1.K;
import D1.K0;
import D1.N;
import D1.O0;
import D1.Z;
import M3.H;
import V1.DialogInterface$OnCancelListenerC1475p;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.material.internal.CheckableImageButton;
import com.openai.chatgpt.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import s1.AbstractC5521c;

/* loaded from: classes.dex */
public final class n<S> extends DialogInterface$OnCancelListenerC1475p {

    /* renamed from: O1  reason: collision with root package name */
    public static final /* synthetic */ int f27162O1 = 0;

    /* renamed from: A1  reason: collision with root package name */
    public int f27163A1;

    /* renamed from: B1  reason: collision with root package name */
    public CharSequence f27164B1;

    /* renamed from: C1  reason: collision with root package name */
    public int f27165C1;

    /* renamed from: D1  reason: collision with root package name */
    public CharSequence f27166D1;

    /* renamed from: E1  reason: collision with root package name */
    public int f27167E1;

    /* renamed from: F1  reason: collision with root package name */
    public CharSequence f27168F1;

    /* renamed from: G1  reason: collision with root package name */
    public int f27169G1;

    /* renamed from: H1  reason: collision with root package name */
    public CharSequence f27170H1;

    /* renamed from: I1  reason: collision with root package name */
    public TextView f27171I1;

    /* renamed from: J1  reason: collision with root package name */
    public CheckableImageButton f27172J1;

    /* renamed from: K1  reason: collision with root package name */
    public f8.g f27173K1;

    /* renamed from: L1  reason: collision with root package name */
    public boolean f27174L1;

    /* renamed from: M1  reason: collision with root package name */
    public CharSequence f27175M1;
    public CharSequence N1;

    /* renamed from: q1  reason: collision with root package name */
    public final LinkedHashSet f27176q1 = new LinkedHashSet();

    /* renamed from: r1  reason: collision with root package name */
    public final LinkedHashSet f27177r1 = new LinkedHashSet();

    /* renamed from: s1  reason: collision with root package name */
    public int f27178s1;

    /* renamed from: t1  reason: collision with root package name */
    public u f27179t1;

    /* renamed from: u1  reason: collision with root package name */
    public c f27180u1;

    /* renamed from: v1  reason: collision with root package name */
    public k f27181v1;

    /* renamed from: w1  reason: collision with root package name */
    public int f27182w1;

    /* renamed from: x1  reason: collision with root package name */
    public CharSequence f27183x1;

    /* renamed from: y1  reason: collision with root package name */
    public boolean f27184y1;

    /* renamed from: z1  reason: collision with root package name */
    public int f27185z1;

    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int R(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c10 = w.c();
        c10.set(5, 1);
        Calendar b10 = w.b(c10);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean S(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(H.l0(R.attr.materialCalendarStyle, context, k.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // V1.DialogInterface$OnCancelListenerC1475p, V1.AbstractComponentCallbacksC1480v
    public final void F(Bundle bundle) {
        p pVar;
        p pVar2;
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f27178s1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        c cVar = this.f27180u1;
        ?? obj = new Object();
        int i10 = a.f27122b;
        int i11 = a.f27122b;
        long j6 = cVar.f27124Y.f27192k0;
        long j10 = cVar.f27125Z.f27192k0;
        obj.f27123a = Long.valueOf(cVar.f27127i0.f27192k0);
        k kVar = this.f27181v1;
        if (kVar == null) {
            pVar = null;
        } else {
            pVar = kVar.f27149d1;
        }
        if (pVar != null) {
            obj.f27123a = Long.valueOf(pVar.f27192k0);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar.f27126h0);
        p c10 = p.c(j6);
        p c11 = p.c(j10);
        b bVar = (b) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = obj.f27123a;
        if (l10 == null) {
            pVar2 = null;
        } else {
            pVar2 = p.c(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c(c10, c11, bVar, pVar2, cVar.f27128j0));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f27182w1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f27183x1);
        bundle.putInt("INPUT_MODE_KEY", this.f27185z1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f27163A1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f27164B1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f27165C1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f27166D1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f27167E1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f27168F1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f27169G1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f27170H1);
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p, V1.AbstractComponentCallbacksC1480v
    public final void G() {
        CharSequence charSequence;
        Integer num;
        boolean z10;
        int i10;
        boolean z11;
        O0 o02;
        O0 o03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.G();
        Dialog dialog = this.f18235l1;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.f27184y1) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.f27173K1);
                if (!this.f27174L1) {
                    View findViewById = L().findViewById(R.id.fullscreen_header);
                    ColorStateList M02 = A7.b.M0(findViewById.getBackground());
                    if (M02 != null) {
                        num = Integer.valueOf(M02.getDefaultColor());
                    } else {
                        num = null;
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    boolean z12 = false;
                    if (num != null && num.intValue() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int Q = P4.a.Q(window.getContext(), 16842801, -16777216);
                    if (z10) {
                        num = Integer.valueOf(Q);
                    }
                    if (i11 >= 30) {
                        AbstractC0364m0.a(window, false);
                    } else {
                        AbstractC0362l0.a(window, false);
                    }
                    window.getContext();
                    Context context = window.getContext();
                    if (i11 < 27) {
                        i10 = AbstractC5521c.d(P4.a.Q(context, 16843858, -16777216), 128);
                    } else {
                        i10 = 0;
                    }
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(i10);
                    boolean f02 = P4.a.f0(num.intValue());
                    if (!P4.a.f0(0) && !f02) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    F4.a aVar = new F4.a(window.getDecorView());
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 30) {
                        insetsController2 = window.getInsetsController();
                        O0 o04 = new O0(insetsController2, aVar);
                        o04.f3240i0 = window;
                        o02 = o04;
                    } else if (i12 >= 26) {
                        o02 = new K0(window, aVar);
                    } else {
                        o02 = new K0(window, aVar);
                    }
                    o02.M(z11);
                    boolean f03 = P4.a.f0(Q);
                    if (P4.a.f0(i10) || (i10 == 0 && f03)) {
                        z12 = true;
                    }
                    F4.a aVar2 = new F4.a(window.getDecorView());
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 30) {
                        insetsController = window.getInsetsController();
                        O0 o05 = new O0(insetsController, aVar2);
                        o05.f3240i0 = window;
                        o03 = o05;
                    } else if (i13 >= 26) {
                        o03 = new K0(window, aVar2);
                    } else {
                        o03 = new K0(window, aVar2);
                    }
                    o03.L(z12);
                    m mVar = new m(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                    WeakHashMap weakHashMap = Z.f3247a;
                    N.u(findViewById, mVar);
                    this.f27174L1 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = p().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f27173K1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView = window.getDecorView();
                Dialog dialog2 = this.f18235l1;
                if (dialog2 != null) {
                    decorView.setOnTouchListener(new X7.a(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            K();
            int i14 = this.f27178s1;
            if (i14 != 0) {
                Q();
                c cVar = this.f27180u1;
                k kVar = new k();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i14);
                bundle.putParcelable("GRID_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle.putParcelable("CURRENT_MONTH_KEY", cVar.f27127i0);
                kVar.N(bundle);
                this.f27181v1 = kVar;
                u uVar = kVar;
                if (this.f27185z1 == 1) {
                    Q();
                    c cVar2 = this.f27180u1;
                    u oVar = new o();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i14);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
                    oVar.N(bundle2);
                    uVar = oVar;
                }
                this.f27179t1 = uVar;
                TextView textView = this.f27171I1;
                if (this.f27185z1 == 1 && p().getConfiguration().orientation == 2) {
                    charSequence = this.N1;
                } else {
                    charSequence = this.f27175M1;
                }
                textView.setText(charSequence);
                Q();
                m();
                throw null;
            }
            Q();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p, V1.AbstractComponentCallbacksC1480v
    public final void H() {
        this.f27179t1.f27206a1.clear();
        super.H();
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p
    public final Dialog P() {
        Context K10 = K();
        K();
        int i10 = this.f27178s1;
        if (i10 != 0) {
            Dialog dialog = new Dialog(K10, i10);
            Context context = dialog.getContext();
            this.f27184y1 = S(context, 16843277);
            this.f27173K1 = new f8.g(context, null, R.attr.materialCalendarStyle, 2131952711);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, O7.a.f13413l, R.attr.materialCalendarStyle, 2131952711);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f27173K1.i(context);
            this.f27173K1.k(ColorStateList.valueOf(color));
            f8.g gVar = this.f27173K1;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = Z.f3247a;
            gVar.j(N.i(decorView));
            return dialog;
        }
        Q();
        throw null;
    }

    public final void Q() {
        AbstractC2469q0.n(this.f18290k0.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f27176q1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f27177r1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f18269J0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p, V1.AbstractComponentCallbacksC1480v
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.f18290k0;
        }
        this.f27178s1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC2469q0.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f27180u1 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC2469q0.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f27182w1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f27183x1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f27185z1 = bundle.getInt("INPUT_MODE_KEY");
        this.f27163A1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f27164B1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f27165C1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f27166D1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f27167E1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f27168F1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f27169G1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f27170H1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f27183x1;
        if (charSequence == null) {
            charSequence = K().getResources().getText(this.f27182w1);
        }
        this.f27175M1 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), Separators.RETURN);
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.N1 = charSequence;
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i10;
        boolean z10;
        String str;
        if (this.f27184y1) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.f27184y1) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(R(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(R(context), -1));
        }
        WeakHashMap weakHashMap = Z.f3247a;
        K.f((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text), 1);
        this.f27172J1 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f27171I1 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f27172J1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f27172J1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, kotlin.jvm.internal.m.u(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], kotlin.jvm.internal.m.u(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f27172J1;
        if (this.f27185z1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton2.setChecked(z10);
        Z.l(this.f27172J1, null);
        CheckableImageButton checkableImageButton3 = this.f27172J1;
        if (this.f27185z1 == 1) {
            str = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f27172J1.setContentDescription(str);
        this.f27172J1.setOnClickListener(new l(0, this));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        Q();
        throw null;
    }
}

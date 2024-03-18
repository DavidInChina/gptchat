package m;

import D1.AbstractC0363m;
import D1.Z;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.openai.chatgpt.R;
import g.DialogC3123p;
import java.util.WeakHashMap;
import l8.AbstractC4344b;

/* renamed from: m.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceC4529i extends DialogC3123p implements DialogInterface, AbstractC4533m {

    /* renamed from: i0  reason: collision with root package name */
    public LayoutInflater$Factory2C4511H f38771i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C4512I f38772j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C4527g f38773k0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v1, types: [m.I] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC4529i(Context context, int i10) {
        super(context, r2);
        int i11;
        int o10 = o(context, i10);
        if (o10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = o10;
        }
        this.f38772j0 = new AbstractC0363m() { // from class: m.I
            @Override // D1.AbstractC0363m
            public final boolean g(KeyEvent keyEvent) {
                return DialogInterfaceC4529i.this.u(keyEvent);
            }
        };
        AbstractC4537q k10 = k();
        if (o10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            o10 = typedValue2.resourceId;
        }
        ((LayoutInflater$Factory2C4511H) k10).f38641Z0 = o10;
        k10.c();
        this.f38773k0 = new C4527g(getContext(), this, getWindow());
    }

    public static int o(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) k();
        layoutInflater$Factory2C4511H.v();
        ((ViewGroup) layoutInflater$Factory2C4511H.f38622G0.findViewById(16908290)).addView(view, layoutParams);
        layoutInflater$Factory2C4511H.f38656r0.b(layoutInflater$Factory2C4511H.f38655q0.getCallback());
    }

    /* renamed from: g */
    public final void dismiss() {
        super.dismiss();
        k().d();
    }

    /* renamed from: i */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC4344b.c0(this.f38772j0, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: j */
    public final View findViewById(int i10) {
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) k();
        layoutInflater$Factory2C4511H.v();
        return layoutInflater$Factory2C4511H.f38655q0.findViewById(i10);
    }

    public final AbstractC4537q k() {
        if (this.f38771i0 == null) {
            ExecutorC4518O executorC4518O = AbstractC4537q.f38780Y;
            this.f38771i0 = new LayoutInflater$Factory2C4511H(getContext(), getWindow(), this, this);
        }
        return this.f38771i0;
    }

    /* renamed from: l */
    public final void invalidateOptionsMenu() {
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) k();
        if (layoutInflater$Factory2C4511H.f38658t0 != null) {
            layoutInflater$Factory2C4511H.B();
            layoutInflater$Factory2C4511H.f38658t0.getClass();
            layoutInflater$Factory2C4511H.C(0);
        }
    }

    public final void m(Bundle bundle) {
        k().a();
        super.onCreate(bundle);
        k().c();
    }

    /* renamed from: n */
    public final void onStop() {
        super.onStop();
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) k();
        layoutInflater$Factory2C4511H.B();
        W w10 = layoutInflater$Factory2C4511H.f38658t0;
        if (w10 != null) {
            w10.f38707E = false;
            androidx.appcompat.view.m mVar = w10.f38706D;
            if (mVar != null) {
                mVar.a();
            }
        }
    }

    @Override // g.DialogC3123p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        ListAdapter listAdapter;
        int i11;
        int i12;
        View view;
        View findViewById;
        m(bundle);
        C4527g c4527g = this.f38773k0;
        c4527g.f38746b.setContentView(c4527g.f38762r);
        Window window = c4527g.f38747c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b10 = C4527g.b(findViewById6, findViewById3);
        ViewGroup b11 = C4527g.b(findViewById7, findViewById4);
        ViewGroup b12 = C4527g.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c4527g.f38753i = nestedScrollView;
        int i13 = 0;
        nestedScrollView.setFocusable(false);
        c4527g.f38753i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b11.findViewById(16908299);
        c4527g.f38758n = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c4527g.f38753i.removeView(c4527g.f38758n);
            if (c4527g.f38749e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c4527g.f38753i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c4527g.f38753i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c4527g.f38749e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                b11.setVisibility(8);
            }
        }
        Button button = (Button) b12.findViewById(16908313);
        c4527g.f38750f = button;
        View$OnClickListenerC4522b view$OnClickListenerC4522b = c4527g.f38768x;
        button.setOnClickListener(view$OnClickListenerC4522b);
        if (TextUtils.isEmpty(null)) {
            c4527g.f38750f.setVisibility(8);
            z10 = false;
        } else {
            c4527g.f38750f.setText((CharSequence) null);
            c4527g.f38750f.setVisibility(0);
            z10 = true;
        }
        Button button2 = (Button) b12.findViewById(16908314);
        c4527g.f38751g = button2;
        button2.setOnClickListener(view$OnClickListenerC4522b);
        if (TextUtils.isEmpty(null)) {
            c4527g.f38751g.setVisibility(8);
        } else {
            c4527g.f38751g.setText((CharSequence) null);
            c4527g.f38751g.setVisibility(0);
            z10 |= true;
        }
        Button button3 = (Button) b12.findViewById(16908315);
        c4527g.f38752h = button3;
        button3.setOnClickListener(view$OnClickListenerC4522b);
        if (TextUtils.isEmpty(null)) {
            c4527g.f38752h.setVisibility(8);
        } else {
            c4527g.f38752h.setText((CharSequence) null);
            c4527g.f38752h.setVisibility(0);
            z10 |= true;
        }
        TypedValue typedValue = new TypedValue();
        c4527g.f38745a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z10) {
                Button button4 = c4527g.f38750f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z10) {
                Button button5 = c4527g.f38751g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z10) {
                Button button6 = c4527g.f38752h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z10) {
            b12.setVisibility(8);
        }
        if (c4527g.f38759o != null) {
            b10.addView(c4527g.f38759o, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c4527g.f38756l = (ImageView) window.findViewById(16908294);
            if ((!TextUtils.isEmpty(c4527g.f38748d)) && c4527g.f38766v) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c4527g.f38757m = textView2;
                textView2.setText(c4527g.f38748d);
                int i14 = c4527g.f38754j;
                if (i14 != 0) {
                    c4527g.f38756l.setImageResource(i14);
                } else {
                    Drawable drawable = c4527g.f38755k;
                    if (drawable != null) {
                        c4527g.f38756l.setImageDrawable(drawable);
                    } else {
                        c4527g.f38757m.setPadding(c4527g.f38756l.getPaddingLeft(), c4527g.f38756l.getPaddingTop(), c4527g.f38756l.getPaddingRight(), c4527g.f38756l.getPaddingBottom());
                        c4527g.f38756l.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                c4527g.f38756l.setVisibility(8);
                b10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (b10 != null && b10.getVisibility() != 8) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (b12.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && (findViewById = b11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = c4527g.f38753i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (c4527g.f38749e != null) {
                view = b10.findViewById(R.id.titleDividerNoCustom);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = b11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c4527g.f38749e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z12 || i10 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i10 != 0) {
                    i11 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i11 = alertController$RecycleListView.f24349h0;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z12) {
                    i12 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i12 = alertController$RecycleListView.f24350i0;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i11, paddingRight, i12);
            }
        }
        if (!z11) {
            View view2 = c4527g.f38749e;
            if (view2 == null) {
                view2 = c4527g.f38753i;
            }
            if (view2 != null) {
                if (z12) {
                    i13 = 2;
                }
                int i15 = i10 | i13;
                View findViewById10 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = Z.f3247a;
                D1.O.d(view2, i15, 3);
                if (findViewById10 != null) {
                    b11.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    b11.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c4527g.f38749e;
        if (alertController$RecycleListView2 != null && (listAdapter = c4527g.f38760p) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i16 = c4527g.f38761q;
            if (i16 > -1) {
                alertController$RecycleListView2.setItemChecked(i16, true);
                alertController$RecycleListView2.setSelection(i16);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f38773k0.f38753i;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f38773k0.f38753i;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* renamed from: p */
    public final void setContentView(int i10) {
        k().g(i10);
    }

    /* renamed from: q */
    public final void setContentView(View view) {
        k().h(view);
    }

    /* renamed from: r */
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().j(view, layoutParams);
    }

    /* renamed from: s */
    public final void setTitle(int i10) {
        super.setTitle(i10);
        k().l(getContext().getString(i10));
    }

    public final void t(CharSequence charSequence) {
        super.setTitle(charSequence);
        k().l(charSequence);
    }

    public final boolean u(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        t(charSequence);
        C4527g c4527g = this.f38773k0;
        c4527g.f38748d = charSequence;
        TextView textView = c4527g.f38757m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

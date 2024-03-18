package V7;

import Df.H;
import H3.d;
import H3.e;
import U3.u;
import a8.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k8.AbstractC4203a;
import kotlin.jvm.internal.m;
import org.xmlpull.v1.XmlPullParserException;
import q.C5200d;
import q.C5235t;
import r1.i;
import r1.p;
import t1.AbstractC5656b;

/* loaded from: classes2.dex */
public final class c extends C5235t {

    /* renamed from: F0  reason: collision with root package name */
    public static final int[] f18414F0 = {R.attr.state_indeterminate};

    /* renamed from: G0  reason: collision with root package name */
    public static final int[] f18415G0 = {R.attr.state_error};

    /* renamed from: H0  reason: collision with root package name */
    public static final int[][] f18416H0 = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: I0  reason: collision with root package name */
    public static final int f18417I0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A0  reason: collision with root package name */
    public boolean f18418A0;

    /* renamed from: B0  reason: collision with root package name */
    public CharSequence f18419B0;

    /* renamed from: C0  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f18420C0;

    /* renamed from: D0  reason: collision with root package name */
    public final e f18421D0;

    /* renamed from: E0  reason: collision with root package name */
    public final a f18422E0;

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet f18423l0 = new LinkedHashSet();

    /* renamed from: m0  reason: collision with root package name */
    public final LinkedHashSet f18424m0 = new LinkedHashSet();

    /* renamed from: n0  reason: collision with root package name */
    public ColorStateList f18425n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f18426o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f18427p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f18428q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f18429r0;

    /* renamed from: s0  reason: collision with root package name */
    public Drawable f18430s0;

    /* renamed from: t0  reason: collision with root package name */
    public Drawable f18431t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f18432u0;

    /* renamed from: v0  reason: collision with root package name */
    public ColorStateList f18433v0;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f18434w0;

    /* renamed from: x0  reason: collision with root package name */
    public PorterDuff.Mode f18435x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f18436y0;

    /* renamed from: z0  reason: collision with root package name */
    public int[] f18437z0;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(Context context, AttributeSet attributeSet) {
        super(AbstractC4203a.a(context, attributeSet, R.attr.checkboxStyle, 2131952702), attributeSet, R.attr.checkboxStyle);
        e eVar;
        Context context2;
        u uVar;
        int z10;
        int next;
        Context context3 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new e(context3);
            Resources resources = context3.getResources();
            Resources.Theme theme = context3.getTheme();
            ThreadLocal threadLocal = p.f44306a;
            Drawable a5 = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            eVar.f7366Y = a5;
            a5.setCallback(eVar.f7364k0);
            new d(eVar.f7366Y.getConstantState());
        } else {
            int i10 = e.f7359l0;
            try {
                XmlResourceParser xml = context3.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    Resources resources2 = context3.getResources();
                    Resources.Theme theme2 = context3.getTheme();
                    e eVar2 = new e(context3);
                    eVar2.inflate(resources2, xml, asAttributeSet, theme2);
                    eVar = eVar2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e10) {
                AbstractC3612c.d("AnimatedVDCompat", "parser error", e10);
                eVar = null;
                this.f18421D0 = eVar;
                this.f18422E0 = new a(this);
                context2 = getContext();
                this.f18430s0 = H1.c.a(this);
                this.f18433v0 = getSuperButtonTintList();
                setSupportButtonTintList(null);
                int[] iArr = O7.a.f13415n;
                k.a(context2, attributeSet, R.attr.checkboxStyle, 2131952702);
                k.b(context2, attributeSet, iArr, R.attr.checkboxStyle, 2131952702, new int[0]);
                uVar = new u(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2131952702));
                this.f18431t0 = uVar.t(2);
                if (this.f18430s0 != null) {
                    z10 = uVar.z(0, 0);
                    int z11 = uVar.z(1, 0);
                    if (z10 == f18417I0) {
                        super.setButtonDrawable((Drawable) null);
                        this.f18430s0 = m.u(context2, R.drawable.mtrl_checkbox_button);
                        this.f18432u0 = true;
                        if (this.f18431t0 == null) {
                        }
                    }
                }
                this.f18434w0 = A7.b.K0(context2, uVar, 3);
                this.f18435x0 = H.j0(uVar.x(4, -1), PorterDuff.Mode.SRC_IN);
                this.f18426o0 = uVar.o(10, false);
                this.f18427p0 = uVar.o(6, true);
                this.f18428q0 = uVar.o(9, false);
                this.f18429r0 = uVar.C(8);
                if (uVar.E(7)) {
                }
                uVar.N();
                a();
            } catch (XmlPullParserException e11) {
                AbstractC3612c.d("AnimatedVDCompat", "parser error", e11);
                eVar = null;
                this.f18421D0 = eVar;
                this.f18422E0 = new a(this);
                context2 = getContext();
                this.f18430s0 = H1.c.a(this);
                this.f18433v0 = getSuperButtonTintList();
                setSupportButtonTintList(null);
                int[] iArr2 = O7.a.f13415n;
                k.a(context2, attributeSet, R.attr.checkboxStyle, 2131952702);
                k.b(context2, attributeSet, iArr2, R.attr.checkboxStyle, 2131952702, new int[0]);
                uVar = new u(context2, context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.checkboxStyle, 2131952702));
                this.f18431t0 = uVar.t(2);
                if (this.f18430s0 != null) {
                }
                this.f18434w0 = A7.b.K0(context2, uVar, 3);
                this.f18435x0 = H.j0(uVar.x(4, -1), PorterDuff.Mode.SRC_IN);
                this.f18426o0 = uVar.o(10, false);
                this.f18427p0 = uVar.o(6, true);
                this.f18428q0 = uVar.o(9, false);
                this.f18429r0 = uVar.C(8);
                if (uVar.E(7)) {
                }
                uVar.N();
                a();
            }
        }
        this.f18421D0 = eVar;
        this.f18422E0 = new a(this);
        context2 = getContext();
        this.f18430s0 = H1.c.a(this);
        this.f18433v0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr22 = O7.a.f13415n;
        k.a(context2, attributeSet, R.attr.checkboxStyle, 2131952702);
        k.b(context2, attributeSet, iArr22, R.attr.checkboxStyle, 2131952702, new int[0]);
        uVar = new u(context2, context2.obtainStyledAttributes(attributeSet, iArr22, R.attr.checkboxStyle, 2131952702));
        this.f18431t0 = uVar.t(2);
        if (this.f18430s0 != null && M3.H.k0(context2, R.attr.isMaterial3Theme, false)) {
            z10 = uVar.z(0, 0);
            int z112 = uVar.z(1, 0);
            if (z10 == f18417I0 && z112 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f18430s0 = m.u(context2, R.drawable.mtrl_checkbox_button);
                this.f18432u0 = true;
                if (this.f18431t0 == null) {
                    this.f18431t0 = m.u(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f18434w0 = A7.b.K0(context2, uVar, 3);
        this.f18435x0 = H.j0(uVar.x(4, -1), PorterDuff.Mode.SRC_IN);
        this.f18426o0 = uVar.o(10, false);
        this.f18427p0 = uVar.o(6, true);
        this.f18428q0 = uVar.o(9, false);
        this.f18429r0 = uVar.C(8);
        if (uVar.E(7)) {
            setCheckedState(uVar.x(7, 0));
        }
        uVar.N();
        a();
    }

    private String getButtonStateDescription() {
        int i10 = this.f18436y0;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i10 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f18425n0 == null) {
            int R10 = P4.a.R(this, R.attr.colorControlActivated);
            int R11 = P4.a.R(this, R.attr.colorError);
            int R12 = P4.a.R(this, R.attr.colorSurface);
            int R13 = P4.a.R(this, R.attr.colorOnSurface);
            this.f18425n0 = new ColorStateList(f18416H0, new int[]{P4.a.k0(1.0f, R12, R11), P4.a.k0(1.0f, R12, R10), P4.a.k0(0.54f, R12, R13), P4.a.k0(0.38f, R12, R13), P4.a.k0(0.38f, R12, R13)});
        }
        return this.f18425n0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f18433v0;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C5200d c5200d;
        Drawable drawable = this.f18430s0;
        ColorStateList colorStateList3 = this.f18433v0;
        PorterDuff.Mode b10 = H1.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b10 != null) {
                AbstractC5656b.i(drawable, b10);
            }
        }
        this.f18430s0 = drawable;
        Drawable drawable2 = this.f18431t0;
        ColorStateList colorStateList4 = this.f18434w0;
        PorterDuff.Mode mode = this.f18435x0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                AbstractC5656b.i(drawable2, mode);
            }
        }
        this.f18431t0 = drawable2;
        if (this.f18432u0) {
            e eVar = this.f18421D0;
            if (eVar != null) {
                Drawable drawable3 = eVar.f7366Y;
                a aVar = this.f18422E0;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f18411a == null) {
                        aVar.f18411a = new H3.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f18411a);
                }
                ArrayList arrayList = eVar.f7363j0;
                H3.c cVar = eVar.f7360Z;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (eVar.f7363j0.size() == 0 && (c5200d = eVar.f7362i0) != null) {
                        cVar.f7355b.removeListener(c5200d);
                        eVar.f7362i0 = null;
                    }
                }
                Drawable drawable4 = eVar.f7366Y;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f18411a == null) {
                        aVar.f18411a = new H3.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f18411a);
                } else if (aVar != null) {
                    if (eVar.f7363j0 == null) {
                        eVar.f7363j0 = new ArrayList();
                    }
                    if (!eVar.f7363j0.contains(aVar)) {
                        eVar.f7363j0.add(aVar);
                        if (eVar.f7362i0 == null) {
                            eVar.f7362i0 = new C5200d(2, eVar);
                        }
                        cVar.f7355b.addListener(eVar.f7362i0);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable5 = this.f18430s0;
                if ((drawable5 instanceof AnimatedStateListDrawable) && eVar != null) {
                    ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                    ((AnimatedStateListDrawable) this.f18430s0).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
                }
            }
        }
        Drawable drawable6 = this.f18430s0;
        if (drawable6 != null && (colorStateList2 = this.f18433v0) != null) {
            AbstractC5656b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f18431t0;
        if (drawable7 != null && (colorStateList = this.f18434w0) != null) {
            AbstractC5656b.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f18430s0;
        Drawable drawable9 = this.f18431t0;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f6 = intrinsicWidth / intrinsicHeight;
                if (f6 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f6);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f6 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f18430s0;
    }

    public Drawable getButtonIconDrawable() {
        return this.f18431t0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f18434w0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f18435x0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f18433v0;
    }

    public int getCheckedState() {
        return this.f18436y0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f18429r0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f18436y0 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18426o0 && this.f18433v0 == null && this.f18434w0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f18414F0);
        }
        if (this.f18428q0) {
            View.mergeDrawableStates(onCreateDrawableState, f18415G0);
        }
        int i11 = 0;
        while (true) {
            if (i11 < onCreateDrawableState.length) {
                int i12 = onCreateDrawableState[i11];
                if (i12 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                } else if (i12 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i11] = 16842912;
                    break;
                } else {
                    i11++;
                }
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f18437z0 = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a5;
        int i10;
        if (this.f18427p0 && TextUtils.isEmpty(getText()) && (a5 = H1.c.a(this)) != null) {
            if (H.b0(this)) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int width = ((getWidth() - a5.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a5.getBounds();
                AbstractC5656b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f18428q0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f18429r0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f18413Y);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, V7.b, android.os.Parcelable] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f18413Y = getCheckedState();
        return baseSavedState;
    }

    @Override // q.C5235t, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(m.u(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f18431t0 = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(m.u(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f18434w0 == colorStateList) {
            return;
        }
        this.f18434w0 = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f18435x0 == mode) {
            return;
        }
        this.f18435x0 = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f18433v0 == colorStateList) {
            return;
        }
        this.f18433v0 = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f18427p0 = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z10;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f18436y0 != i10) {
            this.f18436y0 = i10;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.f18419B0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f18418A0) {
                return;
            }
            this.f18418A0 = true;
            LinkedHashSet linkedHashSet = this.f18424m0;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC2469q0.p(it.next());
                    throw null;
                }
            }
            if (this.f18436y0 != 2 && (onCheckedChangeListener = this.f18420C0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f18418A0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f18429r0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.f18428q0 == z10) {
            return;
        }
        this.f18428q0 = z10;
        refreshDrawableState();
        Iterator it = this.f18423l0.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f18420C0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f18419B0 = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f18426o0 = z10;
        if (z10) {
            H1.b.c(this, getMaterialThemeColorsTintList());
        } else {
            H1.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // q.C5235t, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f18430s0 = drawable;
        this.f18432u0 = false;
        a();
    }
}

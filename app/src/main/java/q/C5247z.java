package q;

import D1.AbstractC0347e;
import D1.AbstractC0376w;
import D1.C0345d;
import D1.C0349f;
import D1.C0353h;
import a1.C1915c;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import c1.AbstractC2279d;
import com.openai.chatgpt.R;
import h.C3276b;

/* renamed from: q.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5247z extends EditText implements AbstractC0376w, H1.A {

    /* renamed from: h0  reason: collision with root package name */
    public final r f43591h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5207f0 f43592i0;

    /* renamed from: j0  reason: collision with root package name */
    public final U3.e f43593j0;

    /* renamed from: k0  reason: collision with root package name */
    public final H1.y f43594k0 = new Object();

    /* renamed from: l0  reason: collision with root package name */
    public final U3.c f43595l0;

    /* renamed from: m0  reason: collision with root package name */
    public C5245y f43596m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v4, types: [U3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [H1.y, java.lang.Object] */
    public C5247z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        q1.a(context);
        p1.a(this, getContext());
        r rVar = new r(this);
        this.f43591h0 = rVar;
        rVar.e(attributeSet, R.attr.editTextStyle);
        C5207f0 c5207f0 = new C5207f0(this);
        this.f43592i0 = c5207f0;
        c5207f0.f(attributeSet, R.attr.editTextStyle);
        c5207f0.b();
        ?? obj = new Object();
        obj.f17400Y = this;
        this.f43593j0 = obj;
        U3.c cVar = new U3.c(this);
        this.f43595l0 = cVar;
        cVar.x(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener r10 = cVar.r(keyListener);
            if (r10 != keyListener) {
                super.setKeyListener(r10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private C5245y getSuperCaller() {
        if (this.f43596m0 == null) {
            this.f43596m0 = new C5245y(this);
        }
        return this.f43596m0;
    }

    @Override // D1.AbstractC0376w
    public final C0353h a(C0353h c0353h) {
        return this.f43594k0.a(this, c0353h);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f43591h0;
        if (rVar != null) {
            rVar.a();
        }
        C5207f0 c5207f0 = this.f43592i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2279d.B(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43591h0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43591h0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43592i0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43592i0.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        U3.e eVar;
        if (Build.VERSION.SDK_INT < 28 && (eVar = this.f43593j0) != null) {
            TextClassifier textClassifier = (TextClassifier) eVar.f17401Z;
            if (textClassifier == null) {
                return X.a((TextView) eVar.f17400Y);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r1 != null) goto L26;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f6;
        InputConnection eVar;
        String[] stringArray;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f43592i0.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && onCreateInputConnection != null) {
            G1.c.a(editorInfo, getText());
        }
        A7.b.p1(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && i10 <= 30 && (f6 = D1.Z.f(this)) != null) {
            if (i10 >= 25) {
                editorInfo.contentMimeTypes = f6;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", f6);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", f6);
            }
            C3276b c3276b = new C3276b(2, this);
            if (i10 >= 25) {
                eVar = new G1.d(onCreateInputConnection, c3276b);
            } else {
                String[] strArr = G1.c.f5850a;
                if (i10 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        eVar = new G1.e(onCreateInputConnection, c3276b);
                    }
                }
            }
            onCreateInputConnection = eVar;
        }
        return this.f43595l0.z(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && D1.Z.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && J.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        ClipData clipData;
        AbstractC0347e abstractC0347e;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31 && D1.Z.f(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                clipData = null;
            } else {
                clipData = clipboardManager.getPrimaryClip();
            }
            if (clipData != null && clipData.getItemCount() > 0) {
                if (i12 >= 31) {
                    abstractC0347e = new C0345d(clipData, 1);
                } else {
                    abstractC0347e = new C0349f(clipData, 1);
                }
                if (i10 == 16908322) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                abstractC0347e.k(i11);
                D1.Z.h(this, abstractC0347e.f());
            }
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43591h0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43591h0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43592i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5207f0 c5207f0 = this.f43592i0;
        if (c5207f0 != null) {
            c5207f0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2279d.E(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((C1915c) ((S1.b) this.f43595l0.f17397h0).f16066c).v(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f43595l0.r(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f43591h0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43591h0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5207f0 c5207f0 = this.f43592i0;
        c5207f0.k(colorStateList);
        c5207f0.b();
    }

    @Override // H1.A
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5207f0 c5207f0 = this.f43592i0;
        c5207f0.l(mode);
        c5207f0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5207f0 c5207f0 = this.f43592i0;
        if (c5207f0 != null) {
            c5207f0.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        U3.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f43593j0) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            eVar.f17401Z = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}

package S1;

import Q1.l;
import V.B;
import a1.C1915c;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class f implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f16074a;

    /* renamed from: b  reason: collision with root package name */
    public final C1915c f16075b;

    public f(KeyListener keyListener) {
        C1915c c1915c = new C1915c(10);
        this.f16074a = keyListener;
        this.f16075b = c1915c;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f16074a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f16074a.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        this.f16075b.getClass();
        Object obj = l.f14325j;
        if (i10 != 67) {
            if (i10 == 112) {
                z10 = B.b(editable, keyEvent, true);
            }
            if (!this.f16074a.onKeyDown(view, editable, i10, keyEvent)) {
                return true;
            }
            return false;
        }
        z10 = B.b(editable, keyEvent, false);
        if (z10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        if (!this.f16074a.onKeyDown(view, editable, i10, keyEvent)) {
        }
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f16074a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f16074a.onKeyUp(view, editable, i10, keyEvent);
    }
}

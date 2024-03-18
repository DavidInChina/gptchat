package T0;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final C f16816a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16817b;

    /* renamed from: c  reason: collision with root package name */
    public int f16818c;

    /* renamed from: d  reason: collision with root package name */
    public z f16819d;

    /* renamed from: e  reason: collision with root package name */
    public int f16820e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16821f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f16822g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f16823h = true;

    public v(z zVar, C c10, boolean z10) {
        this.f16816a = c10;
        this.f16817b = z10;
        this.f16819d = zVar;
    }

    public final void a(AbstractC1414i abstractC1414i) {
        this.f16818c++;
        try {
            this.f16822g.add(abstractC1414i);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i10 = this.f16818c - 1;
        this.f16818c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f16822g;
            if (!arrayList.isEmpty()) {
                this.f16816a.f16737a.f16742e.invoke(kf.t.M2(arrayList));
                arrayList.clear();
            }
        }
        if (this.f16818c > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f16823h;
        if (z10) {
            this.f16818c++;
            return true;
        }
        return z10;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f16823h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f16822g.clear();
        this.f16818c = 0;
        this.f16823h = false;
        D d10 = this.f16816a.f16737a;
        int size = d10.f16746i.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = d10.f16746i;
            if (AbstractC3557B.K(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f16823h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f16823h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f16823h;
        if (z10) {
            return this.f16817b;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f16823h;
        if (z10) {
            a(new C1406a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f16823h;
        if (z10) {
            a(new C1412g(i10, i11));
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f16823h;
        if (z10) {
            a(new C1413h(i10, i11));
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T0.i, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f16823h;
        if (z10) {
            a(new Object());
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        z zVar = this.f16819d;
        return TextUtils.getCapsMode(zVar.f16830a.f12512Y, N0.D.e(zVar.f16831b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = true;
        int i11 = 0;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        this.f16821f = z10;
        if (z10) {
            if (extractedTextRequest != null) {
                i11 = extractedTextRequest.token;
            }
            this.f16820e = i11;
        }
        return Ng.H.y(this.f16819d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (N0.D.b(this.f16819d.f16831b)) {
            return null;
        }
        return U3.f.W(this.f16819d).f12512Y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return U3.f.Y(this.f16819d, i10).f12512Y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return U3.f.Z(this.f16819d, i10).f12512Y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f16823h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case 16908319:
                    a(new y(0, this.f16819d.f16830a.f12512Y.length()));
                    break;
                case 16908320:
                    c(277);
                    break;
                case 16908321:
                    c(278);
                    break;
                case 16908322:
                    c(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f16823h;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        AbstractC3612c.r("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        break;
                }
                this.f16816a.f16737a.f16743f.invoke(new n(i11));
            }
            i11 = 1;
            this.f16816a.f16737a.f16743f.invoke(new n(i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f16823h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = this.f16823h;
        if (z16) {
            boolean z17 = false;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                if ((i10 & 16) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i10 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i10 & 4) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i11 >= 34 && (i10 & 32) != 0) {
                    z17 = true;
                }
                if (!z14 && !z13 && !z15 && !z17) {
                    if (i11 >= 34) {
                        z12 = true;
                        z17 = true;
                    } else {
                        z12 = z17;
                        z17 = true;
                    }
                    z14 = z17;
                } else {
                    z12 = z17;
                    z17 = z15;
                    C1410e c1410e = this.f16816a.f16737a.f16749l;
                    c1410e.f16772e = z14;
                    c1410e.f16773f = z13;
                    c1410e.f16774g = z17;
                    c1410e.f16775h = z12;
                    if (z10) {
                        c1410e.f16771d = true;
                        if (c1410e.f16776i != null) {
                            c1410e.a();
                        }
                    }
                    c1410e.f16770c = z11;
                    return true;
                }
            } else {
                z12 = false;
                z14 = true;
            }
            z13 = z14;
            C1410e c1410e2 = this.f16816a.f16737a.f16749l;
            c1410e2.f16772e = z14;
            c1410e2.f16773f = z13;
            c1410e2.f16774g = z17;
            c1410e2.f16775h = z12;
            if (z10) {
            }
            c1410e2.f16770c = z11;
            return true;
        }
        return z16;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f16823h;
        if (z10) {
            ((BaseInputConnection) this.f16816a.f16737a.f16747j.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f16823h;
        if (z10) {
            a(new w(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f16823h;
        if (z10) {
            a(new x(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f16823h;
        if (z10) {
            a(new y(i10, i11));
            return true;
        }
        return z10;
    }
}

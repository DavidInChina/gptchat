package V0;

import Q1.l;
import Z.AbstractC1710f0;
import Z.C1724m0;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class e extends Q1.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18006a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18007b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18008c;

    public e(C1724m0 c1724m0, f fVar) {
        this.f18007b = c1724m0;
        this.f18008c = fVar;
    }

    @Override // Q1.j
    public final void a() {
        switch (this.f18006a) {
            case 0:
                ((f) this.f18008c).f18009a = i.f18012a;
                return;
            default:
                return;
        }
    }

    @Override // Q1.j
    public final void b() {
        InputFilter[] filters;
        int i10;
        int i11 = this.f18006a;
        Object obj = this.f18008c;
        Object obj2 = this.f18007b;
        switch (i11) {
            case 0:
                ((AbstractC1710f0) obj2).setValue(Boolean.TRUE);
                ((f) obj).f18009a = new j(true);
                return;
            default:
                TextView textView = (TextView) ((Reference) obj2).get();
                InputFilter inputFilter = (InputFilter) ((Reference) obj).get();
                if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                    for (InputFilter inputFilter2 : filters) {
                        if (inputFilter2 == inputFilter) {
                            if (textView.isAttachedToWindow()) {
                                CharSequence text = textView.getText();
                                l a5 = l.a();
                                if (text == null) {
                                    i10 = 0;
                                } else {
                                    a5.getClass();
                                    i10 = text.length();
                                }
                                CharSequence g10 = a5.g(0, i10, text);
                                if (text != g10) {
                                    int selectionStart = Selection.getSelectionStart(g10);
                                    int selectionEnd = Selection.getSelectionEnd(g10);
                                    textView.setText(g10);
                                    if (g10 instanceof Spannable) {
                                        Spannable spannable = (Spannable) g10;
                                        if (selectionStart >= 0 && selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                                            return;
                                        } else if (selectionStart >= 0) {
                                            Selection.setSelection(spannable, selectionStart);
                                            return;
                                        } else if (selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionEnd);
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public e(TextView textView, S1.e eVar) {
        this.f18007b = new WeakReference(textView);
        this.f18008c = new WeakReference(eVar);
    }
}

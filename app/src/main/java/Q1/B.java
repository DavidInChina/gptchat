package Q1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class B implements TextWatcher, SpanWatcher {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f14300Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicInteger f14301Z = new AtomicInteger(0);

    public B(Object obj) {
        this.f14300Y = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f14300Y).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f14300Y).beforeTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
        if (this.f14301Z.get() > 0 && (obj instanceof E)) {
            return;
        }
        ((SpanWatcher) this.f14300Y).onSpanAdded(spannable, obj, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (this.f14301Z.get() > 0 && (obj instanceof E)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i10 > i11) {
                i10 = 0;
            }
            if (i12 > i13) {
                i15 = i10;
                i14 = 0;
                ((SpanWatcher) this.f14300Y).onSpanChanged(spannable, obj, i15, i11, i14, i13);
            }
        }
        i15 = i10;
        i14 = i12;
        ((SpanWatcher) this.f14300Y).onSpanChanged(spannable, obj, i15, i11, i14, i13);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
        if (this.f14301Z.get() > 0 && (obj instanceof E)) {
            return;
        }
        ((SpanWatcher) this.f14300Y).onSpanRemoved(spannable, obj, i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f14300Y).onTextChanged(charSequence, i10, i11, i12);
    }
}

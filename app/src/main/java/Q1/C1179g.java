package Q1;

import a1.C1915c;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;

/* renamed from: Q1.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1179g extends F4.a {

    /* renamed from: h0  reason: collision with root package name */
    public volatile V.B f14320h0;

    /* renamed from: i0  reason: collision with root package name */
    public volatile U3.n f14321i0;

    public final int I(int i10, CharSequence charSequence) {
        V.B b10 = this.f14320h0;
        b10.getClass();
        if (i10 >= 0 && i10 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                E[] eArr = (E[]) spanned.getSpans(i10, i10 + 1, E.class);
                if (eArr.length > 0) {
                    return spanned.getSpanEnd(eArr[0]);
                }
            }
            return ((t) b10.d(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new t(i10))).f14348h0;
        }
        return -1;
    }

    public final int J(int i10, CharSequence charSequence) {
        V.B b10 = this.f14320h0;
        b10.getClass();
        if (i10 >= 0 && i10 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                E[] eArr = (E[]) spanned.getSpans(i10, i10 + 1, E.class);
                if (eArr.length > 0) {
                    return spanned.getSpanStart(eArr[0]);
                }
            }
            return ((t) b10.d(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new t(i10))).f14347Z;
        }
        return -1;
    }

    public final void K() {
        try {
            ((l) this.f5033Z).f14332f.a(new C1178f(this));
        } catch (Throwable th2) {
            ((l) this.f5033Z).e(th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:7:0x0014, B:10:0x0019, B:12:0x001d, B:14:0x002a, B:18:0x003e, B:20:0x0048, B:22:0x0052, B:24:0x0055, B:26:0x0058, B:28:0x0068, B:29:0x006b, B:32:0x0079, B:35:0x0080, B:37:0x0097), top: B:48:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:7:0x0014, B:10:0x0019, B:12:0x001d, B:14:0x002a, B:18:0x003e, B:20:0x0048, B:22:0x0052, B:24:0x0055, B:26:0x0058, B:28:0x0068, B:29:0x006b, B:32:0x0079, B:35:0x0080, B:37:0x0097), top: B:48:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, Q1.I] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence L(CharSequence charSequence, int i10, int i11, boolean z10) {
        I i12;
        int i13;
        I i14;
        E[] eArr;
        V.B b10 = this.f14320h0;
        b10.getClass();
        boolean z11 = charSequence instanceof C;
        if (z11) {
            ((C) charSequence).a();
        }
        if (!z11) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, E.class) <= i11) {
                        ?? obj = new Object();
                        obj.f14313Y = false;
                        obj.f14314Z = new SpannableString(charSequence);
                        i12 = obj;
                    } else {
                        i12 = null;
                    }
                    if (i12 != null && (eArr = (E[]) i12.f14314Z.getSpans(i10, i11, E.class)) != null && eArr.length > 0) {
                        for (E e10 : eArr) {
                            int spanStart = i12.f14314Z.getSpanStart(e10);
                            int spanEnd = i12.f14314Z.getSpanEnd(e10);
                            if (spanStart != i11) {
                                i12.removeSpan(e10);
                            }
                            i10 = Math.min(spanStart, i10);
                            i11 = Math.max(spanEnd, i11);
                        }
                    }
                    i13 = i10;
                    if (i13 != i11 && i13 < charSequence.length()) {
                        i14 = (I) b10.d(charSequence, i13, i11, Integer.MAX_VALUE, z10, new r(i12, (C1915c) b10.f17895b));
                        if (i14 == null) {
                            Spannable spannable = i14.f14314Z;
                            if (z11) {
                                ((C) charSequence).b();
                            }
                            return spannable;
                        }
                        if (!z11) {
                            return charSequence;
                        }
                        return charSequence;
                    }
                    return charSequence;
                }
            } finally {
                if (z11) {
                    ((C) charSequence).b();
                }
            }
        }
        i12 = new I((Spannable) charSequence);
        if (i12 != null) {
            while (r1 < r4) {
            }
        }
        i13 = i10;
        if (i13 != i11) {
            i14 = (I) b10.d(charSequence, i13, i11, Integer.MAX_VALUE, z10, new r(i12, (C1915c) b10.f17895b));
            if (i14 == null) {
            }
        }
        return charSequence;
    }

    public final void M(EditorInfo editorInfo) {
        int i10;
        Bundle bundle = editorInfo.extras;
        R1.b bVar = (R1.b) this.f14321i0.f17426Y;
        int a5 = bVar.a(4);
        if (a5 != 0) {
            i10 = ((ByteBuffer) bVar.f15023d).getInt(a5 + bVar.f15020a);
        } else {
            i10 = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i10);
        Bundle bundle2 = editorInfo.extras;
        ((l) this.f5033Z).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}

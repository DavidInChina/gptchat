package D1;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class D extends F {

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f3219j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(int i10, int i11) {
        super(i10, Boolean.class, 0, 28);
        this.f3219j0 = i11;
    }

    @Override // D1.F
    public final Object b(View view) {
        int i10 = this.f3219j0;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(S.d(view));
                    default:
                        return Boolean.valueOf(S.c(view));
                }
            case 1:
                switch (i10) {
                    case 1:
                        return S.b(view);
                    default:
                        return U.b(view);
                }
            case 2:
                switch (i10) {
                    case 1:
                        return S.b(view);
                    default:
                        return U.b(view);
                }
            default:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(S.d(view));
                    default:
                        return Boolean.valueOf(S.c(view));
                }
        }
    }

    @Override // D1.F
    public final void c(View view, Object obj) {
        int i10 = this.f3219j0;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        S.j(view, bool.booleanValue());
                        return;
                    default:
                        S.g(view, bool.booleanValue());
                        return;
                }
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                switch (i10) {
                    case 1:
                        S.h(view, charSequence);
                        return;
                    default:
                        U.f(view, charSequence);
                        return;
                }
            case 2:
                CharSequence charSequence2 = (CharSequence) obj;
                switch (i10) {
                    case 1:
                        S.h(view, charSequence2);
                        return;
                    default:
                        U.f(view, charSequence2);
                        return;
                }
            default:
                Boolean bool2 = (Boolean) obj;
                switch (i10) {
                    case 0:
                        S.j(view, bool2.booleanValue());
                        return;
                    default:
                        S.g(view, bool2.booleanValue());
                        return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r4 == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
        if (r4 == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0087, code lost:
        if (r4 == r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0089, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
        if (r4 == r5) goto L56;
     */
    @Override // D1.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean equals;
        boolean equals2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = false;
        int i10 = this.f3219j0;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                switch (i10) {
                    case 0:
                        if (bool != null && bool.booleanValue()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (bool2 != null && bool2.booleanValue()) {
                            z11 = true;
                            break;
                        } else {
                            z11 = false;
                            break;
                        }
                    default:
                        if (bool != null && bool.booleanValue()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (bool2 != null && bool2.booleanValue()) {
                            z13 = true;
                            break;
                        } else {
                            z13 = false;
                            break;
                        }
                        break;
                }
                return !z18;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                switch (i10) {
                    case 1:
                        equals = TextUtils.equals(charSequence, charSequence2);
                        break;
                    default:
                        equals = TextUtils.equals(charSequence, charSequence2);
                        break;
                }
                return !equals;
            case 2:
                CharSequence charSequence3 = (CharSequence) obj;
                CharSequence charSequence4 = (CharSequence) obj2;
                switch (i10) {
                    case 1:
                        equals2 = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        equals2 = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
                return !equals2;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                switch (i10) {
                    case 0:
                        if (bool3 != null && bool3.booleanValue()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (bool4 != null && bool4.booleanValue()) {
                            z15 = true;
                            break;
                        } else {
                            z15 = false;
                            break;
                        }
                        break;
                    default:
                        if (bool3 != null && bool3.booleanValue()) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (bool4 != null && bool4.booleanValue()) {
                            z17 = true;
                            break;
                        } else {
                            z17 = false;
                            break;
                        }
                }
                return !z18;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i10, int i11, int i12, int i13) {
        super(i10, CharSequence.class, i11, i12);
        this.f3219j0 = i13;
    }
}

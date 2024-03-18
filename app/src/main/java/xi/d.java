package xi;

import wi.w;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f50076a;

    /* renamed from: b  reason: collision with root package name */
    public final w f50077b;

    public d(CharSequence charSequence, w wVar) {
        if (charSequence != null) {
            this.f50076a = charSequence;
            this.f50077b = wVar;
            return;
        }
        throw new NullPointerException("content must not be null");
    }

    public final d a(int i10, int i11) {
        w wVar;
        CharSequence subSequence = this.f50076a.subSequence(i10, i11);
        w wVar2 = this.f50077b;
        if (wVar2 != null) {
            int i12 = wVar2.f48617b + i10;
            int i13 = i11 - i10;
            if (i13 != 0) {
                wVar = new w(wVar2.f48616a, i12, i13);
                return new d(subSequence, wVar);
            }
        }
        wVar = null;
        return new d(subSequence, wVar);
    }
}

package B1;

/* loaded from: classes2.dex */
public final class k implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final k f1724a = new Object();

    @Override // B1.l
    public final int a(int i10, CharSequence charSequence) {
        int i11 = 2;
        for (int i12 = 0; i12 < i10 && i11 == 2; i12++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i12));
            n nVar = o.f1727a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i11 = 2;
                            break;
                    }
                }
                i11 = 0;
            }
            i11 = 1;
        }
        return i11;
    }
}

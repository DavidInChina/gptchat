package I8;

/* loaded from: classes.dex */
public final class j extends E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8101a;

    public j(int i10) {
        this.f8101a = i10;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        switch (this.f8101a) {
            case 0:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return Double.valueOf(bVar.d0());
            default:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return Float.valueOf((float) bVar.d0());
        }
    }

    @Override // I8.E
    public final /* bridge */ /* synthetic */ void c(P8.c cVar, Object obj) {
        switch (this.f8101a) {
            case 0:
                d(cVar, (Number) obj);
                return;
            default:
                d(cVar, (Number) obj);
                return;
        }
    }

    public final void d(P8.c cVar, Number number) {
        switch (this.f8101a) {
            case 0:
                if (number == null) {
                    cVar.F();
                    return;
                }
                double doubleValue = number.doubleValue();
                n.a(doubleValue);
                cVar.S(doubleValue);
                return;
            default:
                if (number == null) {
                    cVar.F();
                    return;
                }
                float floatValue = number.floatValue();
                n.a(floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                cVar.d0(number);
                return;
        }
    }
}

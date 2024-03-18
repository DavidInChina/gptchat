package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3856y1 extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    protected final H0 f35780a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f35781b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3856y1(H0 h02) {
        this.f35780a = h02;
        this.f35781b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3856y1(AbstractC3856y1 abstractC3856y1, H0 h02, int i10) {
        super(abstractC3856y1);
        this.f35780a = h02;
        this.f35781b = i10;
    }

    abstract void a();

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C3851x1 c3851x1;
        C3851x1 c3851x12;
        C3851x1 c3851x13 = this;
        while (c3851x13.f35780a.q() != 0) {
            c3851x13.setPendingCount(c3851x13.f35780a.q() - 1);
            int i10 = 0;
            int i11 = 0;
            while (i10 < c3851x13.f35780a.q() - 1) {
                int i12 = c3851x13.f35781b + i11;
                C3851x1 c3851x14 = (C3851x1) c3851x13;
                switch (c3851x14.f35765c) {
                    case 0:
                        c3851x12 = new C3851x1(c3851x14, ((G0) c3851x14.f35780a).a(i10), i12);
                        break;
                    default:
                        c3851x12 = new C3851x1(c3851x14, c3851x14.f35780a.a(i10), i12);
                        break;
                }
                i11 = (int) (i11 + c3851x12.f35780a.count());
                c3851x12.fork();
                i10++;
            }
            int i13 = c3851x13.f35781b + i11;
            C3851x1 c3851x15 = (C3851x1) c3851x13;
            switch (c3851x15.f35765c) {
                case 0:
                    c3851x1 = new C3851x1(c3851x15, ((G0) c3851x15.f35780a).a(i10), i13);
                    break;
                default:
                    c3851x1 = new C3851x1(c3851x15, c3851x15.f35780a.a(i10), i13);
                    break;
            }
            c3851x13 = c3851x1;
        }
        c3851x13.a();
        c3851x13.propagateCompletion();
    }
}

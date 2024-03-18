package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    l[] f35306a;

    /* renamed from: b  reason: collision with root package name */
    l f35307b = null;

    /* renamed from: c  reason: collision with root package name */
    p f35308c;

    /* renamed from: d  reason: collision with root package name */
    p f35309d;

    /* renamed from: e  reason: collision with root package name */
    int f35310e;

    /* renamed from: f  reason: collision with root package name */
    int f35311f;

    /* renamed from: g  reason: collision with root package name */
    int f35312g;

    /* renamed from: h  reason: collision with root package name */
    final int f35313h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(l[] lVarArr, int i10, int i11, int i12) {
        this.f35306a = lVarArr;
        this.f35313h = i10;
        this.f35310e = i11;
        this.f35311f = i11;
        this.f35312g = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        l[] lVarArr;
        int length;
        int i10;
        p pVar;
        p pVar2;
        l lVar = this.f35307b;
        if (lVar != null) {
            lVar = lVar.f35301d;
        }
        while (lVar == null) {
            if (this.f35311f >= this.f35312g || (lVarArr = this.f35306a) == null || (length = lVarArr.length) <= (i10 = this.f35310e) || i10 < 0) {
                this.f35307b = null;
                return null;
            }
            l k10 = ConcurrentHashMap.k(lVarArr, i10);
            if (k10 == null || k10.f35298a >= 0) {
                lVar = k10;
            } else if (k10 instanceof g) {
                this.f35306a = ((g) k10).f35291e;
                p pVar3 = this.f35309d;
                if (pVar3 != null) {
                    this.f35309d = pVar3.f35305d;
                    pVar2 = pVar3;
                } else {
                    pVar2 = new Object();
                }
                pVar2.f35304c = lVarArr;
                pVar2.f35302a = length;
                pVar2.f35303b = i10;
                pVar2.f35305d = this.f35308c;
                this.f35308c = pVar2;
                lVar = null;
            } else {
                lVar = k10 instanceof r ? ((r) k10).f35317f : null;
            }
            if (this.f35308c != null) {
                while (true) {
                    pVar = this.f35308c;
                    if (pVar == null) {
                        break;
                    }
                    int i11 = this.f35310e;
                    int i12 = pVar.f35302a;
                    int i13 = i11 + i12;
                    this.f35310e = i13;
                    if (i13 < length) {
                        break;
                    }
                    this.f35310e = pVar.f35303b;
                    this.f35306a = pVar.f35304c;
                    pVar.f35304c = null;
                    p pVar4 = pVar.f35305d;
                    pVar.f35305d = this.f35309d;
                    this.f35308c = pVar4;
                    this.f35309d = pVar;
                    length = i12;
                }
                if (pVar == null) {
                    int i14 = this.f35310e + this.f35313h;
                    this.f35310e = i14;
                    if (i14 >= length) {
                        int i15 = this.f35311f + 1;
                        this.f35311f = i15;
                        this.f35310e = i15;
                    }
                }
            } else {
                int i16 = i10 + this.f35313h;
                this.f35310e = i16;
                if (i16 >= length) {
                    int i17 = this.f35311f + 1;
                    this.f35311f = i17;
                    this.f35310e = i17;
                }
            }
        }
        this.f35307b = lVar;
        return lVar;
    }
}

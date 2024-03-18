package M6;

import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements ff.e {

    /* renamed from: b  reason: collision with root package name */
    public final ff.b f11672b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11673c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f11674d;

    /* renamed from: e  reason: collision with root package name */
    public ff.d f11675e;

    /* renamed from: f  reason: collision with root package name */
    public String f11676f;

    /* renamed from: g  reason: collision with root package name */
    public String f11677g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f11678h;

    public c(d dVar, String str, ff.b bVar) {
        this.f11678h = dVar;
        this.f11674d = new LinkedHashMap(dVar.f11686k0);
        this.f11673c = str;
        this.f11672b = bVar;
    }

    @Override // ff.e
    public final ff.e a(ff.d dVar) {
        this.f11675e = dVar;
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [M6.i, java.math.BigInteger] */
    public final i b() {
        ?? bigInteger;
        do {
            synchronized (this.f11678h.f11694s0) {
                bigInteger = new BigInteger(63, this.f11678h.f11694s0);
            }
        } while (bigInteger.signum() == 0);
        return bigInteger;
    }

    public final void c(String str, String str2) {
        LinkedHashMap linkedHashMap = this.f11674d;
        if (str2 != null && !str2.isEmpty()) {
            linkedHashMap.put(str, str2);
        } else {
            linkedHashMap.remove(str);
        }
    }

    @Override // ff.e
    public final ff.c start() {
        h hVar;
        ConcurrentHashMap concurrentHashMap;
        String str;
        int i10;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        String str2;
        int i11;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        Map map;
        String str3;
        ff.c b10;
        i b11 = b();
        ff.d dVar = this.f11675e;
        if (dVar == null && (b10 = ((Q6.a) this.f11672b).b()) != null) {
            dVar = b10.c();
        }
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            bigInteger2 = bVar.f11660d;
            BigInteger bigInteger5 = bVar.f11661e;
            ConcurrentHashMap concurrentHashMap2 = bVar.f11659c;
            h hVar2 = bVar.f11658b;
            if (this.f11676f == null) {
                this.f11676f = bVar.f11664h;
            }
            concurrentHashMap = concurrentHashMap2;
            hVar = hVar2;
            str = null;
            i10 = Integer.MIN_VALUE;
            bigInteger = bigInteger5;
        } else {
            if (dVar instanceof P6.e) {
                P6.e eVar = (P6.e) dVar;
                bigInteger4 = eVar.f13828c;
                bigInteger3 = eVar.f13829d;
                i11 = eVar.f13830e;
                map = eVar.f13831f;
            } else {
                i b12 = b();
                bigInteger3 = BigInteger.ZERO;
                i11 = Integer.MIN_VALUE;
                bigInteger4 = b12;
                map = null;
            }
            if (dVar instanceof P6.i) {
                P6.i iVar = (P6.i) dVar;
                this.f11674d.putAll(iVar.f13835b);
                str3 = iVar.f13834a;
            } else {
                str3 = this.f11677g;
            }
            this.f11674d.putAll(this.f11678h.f11685j0);
            h hVar3 = new h(this.f11678h, bigInteger4);
            str = str3;
            concurrentHashMap = map;
            bigInteger2 = bigInteger4;
            bigInteger = bigInteger3;
            hVar = hVar3;
            i10 = i11;
        }
        if (this.f11676f == null) {
            this.f11676f = this.f11678h.f11681Y;
        }
        String str4 = this.f11673c;
        if (str4 != null) {
            str2 = str4;
        } else {
            str2 = null;
        }
        String str5 = this.f11676f;
        LinkedHashMap linkedHashMap = this.f11674d;
        d dVar2 = this.f11678h;
        b bVar2 = new b(bigInteger2, b11, bigInteger, str5, str2, i10, str, concurrentHashMap, linkedHashMap, hVar, dVar2, dVar2.f11687l0);
        for (Map.Entry entry : this.f11674d.entrySet()) {
            if (entry.getValue() == null) {
                bVar2.i((String) entry.getKey(), null);
            } else {
                List<N6.a> list = (List) this.f11678h.f11690o0.get((String) entry.getKey());
                if (list != null) {
                    boolean z10 = true;
                    for (N6.a aVar : list) {
                        try {
                            z10 &= aVar.a(bVar2, (String) entry.getKey(), entry.getValue());
                        } catch (Throwable unused) {
                        }
                    }
                    if (!z10) {
                        bVar2.i((String) entry.getKey(), null);
                    }
                }
            }
        }
        return new a(bVar2);
    }
}

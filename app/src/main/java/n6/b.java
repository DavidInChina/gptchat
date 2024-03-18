package N6;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12720c;

    public b(int i10) {
        this.f12720c = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        this.f12718a = "db.type";
                        this.f12719b = "service.name";
                        return;
                    }
                    this.f12718a = "servlet.context";
                    return;
                }
                this.f12718a = "peer.service";
                return;
            }
            this.f12718a = "manual.keep";
            return;
        }
        this.f12718a = "manual.drop";
    }

    @Override // N6.a
    public final boolean a(M6.b bVar, String str, Object obj) {
        switch (this.f12720c) {
            case 0:
                String str2 = this.f12719b;
                if (str2 != null) {
                    str = str2;
                }
                bVar.i(str, String.valueOf(obj));
                if (!"couchbase".equals(obj) && !"elasticsearch".equals(obj)) {
                    if (!"mongo".equals(obj) && !"cassandra".equals(obj)) {
                        "memcached".equals(obj);
                    }
                    bVar.f11666j = String.valueOf(obj).concat(".query");
                }
                return true;
            case 1:
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    bVar.g(-1);
                } else if ((obj instanceof String) && Boolean.parseBoolean((String) obj)) {
                    bVar.g(-1);
                }
                return false;
            case 2:
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    bVar.g(2);
                } else if ((obj instanceof String) && Boolean.parseBoolean((String) obj)) {
                    bVar.g(2);
                }
                return false;
            case 3:
                bVar.h(String.valueOf(obj));
                return false;
            default:
                String trim = String.valueOf(obj).trim();
                if (!trim.equals(Separators.SLASH) && (bVar.f11664h.equals("unnamed-java-app") || bVar.f11664h.isEmpty())) {
                    if (trim.startsWith(Separators.SLASH) && trim.length() > 1) {
                        trim = trim.substring(1);
                    }
                    if (!trim.isEmpty()) {
                        bVar.h(trim);
                    }
                }
                return true;
        }
    }
}

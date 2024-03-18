package O8;

import I8.E;
import com.auth0.android.request.internal.i;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
public final class c extends E {

    /* renamed from: b  reason: collision with root package name */
    public static final i f13432b = new i(6);

    /* renamed from: a  reason: collision with root package name */
    public final E f13433a;

    public c(E e10) {
        this.f13433a = e10;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        Date date = (Date) this.f13433a.b(bVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        this.f13433a.c(cVar, (Timestamp) obj);
    }
}

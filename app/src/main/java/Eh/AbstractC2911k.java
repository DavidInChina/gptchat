package eh;

import dh.u0;
import fh.AbstractC3072O;
import fh.C3071N;
import fh.C3091r;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonNull;

/* renamed from: eh.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2911k {

    /* renamed from: a  reason: collision with root package name */
    public static final InlineClassDescriptor f29457a = L4.a.q("kotlinx.serialization.json.JsonUnquotedLiteral", u0.f28491a);

    public static final kotlinx.serialization.json.d a(Number number) {
        return new C2918r(number, false, null);
    }

    public static final kotlinx.serialization.json.d b(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new C2918r(str, true, null);
    }

    public static final void c(String str, kotlinx.serialization.json.b bVar) {
        throw new IllegalArgumentException("Element " + C.f37623a.b(bVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(kotlinx.serialization.json.d dVar) {
        String r10 = dVar.r();
        String[] strArr = AbstractC3072O.f30845a;
        AbstractC3557B.c0("<this>", r10);
        if (Lg.n.f2(r10, "true")) {
            return Boolean.TRUE;
        }
        if (Lg.n.f2(r10, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String e(kotlinx.serialization.json.d dVar) {
        AbstractC3557B.c0("<this>", dVar);
        if (dVar instanceof JsonNull) {
            return null;
        }
        return dVar.r();
    }

    public static final int f(kotlinx.serialization.json.d dVar) {
        try {
            long i10 = new C3071N(dVar.r()).i();
            if (-2147483648L <= i10 && i10 <= 2147483647L) {
                return (int) i10;
            }
            throw new NumberFormatException(dVar.r() + " is not an Int");
        } catch (C3091r e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final kotlinx.serialization.json.c g(kotlinx.serialization.json.b bVar) {
        kotlinx.serialization.json.c cVar;
        AbstractC3557B.c0("<this>", bVar);
        if (bVar instanceof kotlinx.serialization.json.c) {
            cVar = (kotlinx.serialization.json.c) bVar;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        c("JsonObject", bVar);
        throw null;
    }

    public static final kotlinx.serialization.json.d h(kotlinx.serialization.json.b bVar) {
        kotlinx.serialization.json.d dVar;
        AbstractC3557B.c0("<this>", bVar);
        if (bVar instanceof kotlinx.serialization.json.d) {
            dVar = (kotlinx.serialization.json.d) bVar;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        c("JsonPrimitive", bVar);
        throw null;
    }
}

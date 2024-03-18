package u7;

import N0.y;
import android.gov.nist.javax.sip.header.ParameterNames;
import b9.EnumC2132a;
import id.AbstractC3557B;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.crypto.KeyAgreement;
import u8.AbstractC5856f;

/* renamed from: u7.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5848d implements AbstractC5856f, C8.i, K8.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46451Y;

    public C5848d() {
        this.f46451Y = 0;
    }

    public static final y b(C5848d c5848d, y yVar, y yVar2) {
        c5848d.getClass();
        if (yVar != null) {
            return yVar.c(yVar2);
        }
        return yVar2;
    }

    public static String c(EnumC2132a enumC2132a) {
        AbstractC3557B.c0("<this>", enumC2132a);
        int ordinal = enumC2132a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return "Username-Password-Authentication";
                        }
                        throw new RuntimeException();
                    }
                    return "windowslive";
                }
                return "google-oauth2";
            }
            return "apple";
        }
        return "";
    }

    public static U8.o d(String str, Map map) {
        AbstractC3557B.c0(ParameterNames.TAG, str);
        AbstractC3557B.c0("tags", map);
        String v22 = Lg.n.v2("format:", str);
        Object obj = null;
        if (v22 == str) {
            Iterator it = ((List) U8.o.f17544d.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3557B.K(((U8.o) next).f17545a, str)) {
                    obj = next;
                    break;
                }
            }
            return (U8.o) obj;
        }
        Object obj2 = map.get(v22);
        if (!(obj2 instanceof U8.o)) {
            return null;
        }
        return (U8.o) obj2;
    }

    @Override // u8.AbstractC5857g
    public final Object a() {
        return new Object();
    }

    @Override // C8.i
    public final Object f(Provider provider) {
        switch (this.f46451Y) {
            case 11:
                if (provider == null) {
                    return KeyAgreement.getInstance("SHA-512");
                }
                return KeyAgreement.getInstance("SHA-512", provider);
            case 12:
                if (provider == null) {
                    return KeyPairGenerator.getInstance("SHA-512");
                }
                return KeyPairGenerator.getInstance("SHA-512", provider);
            default:
                if (provider == null) {
                    return MessageDigest.getInstance("SHA-512");
                }
                return MessageDigest.getInstance("SHA-512", provider);
        }
    }

    @Override // K8.n
    public final Object i() {
        switch (this.f46451Y) {
            case 14:
                return new TreeSet();
            case 15:
                return new ArrayDeque();
            case 16:
                return new ConcurrentSkipListMap();
            case 17:
                return new TreeMap();
            default:
                return new K8.m(true);
        }
    }

    public /* synthetic */ C5848d(int i10) {
        this.f46451Y = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5848d(int i10, int i11) {
        this(29);
        this.f46451Y = i10;
        switch (i10) {
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
            default:
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                return;
        }
    }
}

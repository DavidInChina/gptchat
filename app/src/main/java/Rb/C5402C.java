package rb;

import android.app.Application;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p1.AbstractC5042g;
import u7.AbstractC5846b;
import u7.C5850f;
import wd.s0;
import wd.u0;
import x8.W;
import yf.AbstractC6583a;

/* renamed from: rb.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5402C {

    /* renamed from: a  reason: collision with root package name */
    public final Application f44653a;

    public C5402C(Application application) {
        this.f44653a = application;
    }

    public final s0 a(String str) {
        if (AbstractC5042g.a(this.f44653a, str) != 0) {
            return new s0(0, new C5407H(str));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: CancellationException -> 0x002f, SecurityException -> 0x0032, TryCatch #2 {SecurityException -> 0x0032, CancellationException -> 0x002f, blocks: (B:12:0x002a, B:22:0x0061, B:26:0x0088, B:28:0x00a1, B:29:0x00b0, B:31:0x00b6, B:34:0x00c7, B:35:0x00c9), top: B:39:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[Catch: CancellationException -> 0x002f, SecurityException -> 0x0032, TryCatch #2 {SecurityException -> 0x0032, CancellationException -> 0x002f, blocks: (B:12:0x002a, B:22:0x0061, B:26:0x0088, B:28:0x00a1, B:29:0x00b0, B:31:0x00b6, B:34:0x00c7, B:35:0x00c9), top: B:39:0x0024 }] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9, types: [kf.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C5401B c5401b;
        int i10;
        Geocoder geocoder;
        List<Address> fromLocation;
        ?? r15;
        try {
            if (abstractC4825e instanceof C5401B) {
                c5401b = (C5401B) abstractC4825e;
                int i11 = c5401b.f44652i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c5401b.f44652i0 = i11 - Integer.MIN_VALUE;
                    Object obj = c5401b.f44650Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c5401b.f44652i0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            Geocoder geocoder2 = c5401b.f44649Y;
                            N.B0(obj);
                            geocoder = geocoder2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        s0 a5 = a("android.permission.ACCESS_COARSE_LOCATION");
                        if (a5 != null) {
                            return a5;
                        }
                        Locale locale = Locale.getDefault();
                        Application application = this.f44653a;
                        Geocoder geocoder3 = new Geocoder(application, locale);
                        int i12 = K7.b.f9532a;
                        u7.g gVar = new u7.g(application, J7.a.f8863k, AbstractC5846b.f46450G, C5850f.f46453c);
                        v7.l lVar = new v7.l();
                        lVar.f47319e = R4.a.f15039Y;
                        lVar.f47318d = 2414;
                        N7.m b10 = gVar.b(0, lVar.a());
                        AbstractC3557B.b0("getLastLocation(...)", b10);
                        c5401b.f44649Y = geocoder3;
                        c5401b.f44652i0 = 1;
                        Object T = Bi.c.T(b10, c5401b);
                        if (T == enumC5000a) {
                            return enumC5000a;
                        }
                        geocoder = geocoder3;
                        obj = T;
                    }
                    Location location = (Location) obj;
                    fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    if (fromLocation == null) {
                        r15 = new ArrayList(AbstractC6583a.H1(fromLocation, 10));
                        for (Address address : fromLocation) {
                            r15.add(address.toString());
                        }
                    } else {
                        r15 = 0;
                    }
                    if (r15 == 0) {
                        r15 = kf.v.f37483Y;
                    }
                    return new u0(new C5406G(latitude, longitude, r15));
                }
            }
            if (i10 == 0) {
            }
            Location location2 = (Location) obj;
            fromLocation = geocoder.getFromLocation(location2.getLatitude(), location2.getLongitude(), 1);
            double latitude2 = location2.getLatitude();
            double longitude2 = location2.getLongitude();
            if (fromLocation == null) {
            }
            if (r15 == 0) {
            }
            return new u0(new C5406G(latitude2, longitude2, r15));
        } catch (SecurityException e10) {
            W.W(Pc.e.a(), "getLocation exception", e10, null, 4);
            return new s0(0, e10);
        } catch (CancellationException e11) {
            W.W(Pc.e.a(), "getLocation exception", e11, null, 4);
            return new s0(0, e11);
        }
        c5401b = new C5401B(this, abstractC4825e);
        Object obj2 = c5401b.f44650Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5401b.f44652i0;
    }
}

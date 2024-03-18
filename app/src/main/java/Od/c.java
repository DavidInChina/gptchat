package Od;

import Ng.F;
import Qd.A;
import android.media.MediaDrm;
import android.os.Build;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.security.MessageDigest;
import java.util.UUID;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ e f13687Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f13688Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f13689h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, boolean z10, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f13687Y = eVar;
        this.f13688Z = z10;
        this.f13689h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new c(this.f13687Y, this.f13688Z, this.f13689h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        if (r9 >= 28) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
        r4.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        r4.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r4 != null) goto L16;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MediaDrm mediaDrm;
        Throwable th2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        e eVar = this.f13687Y;
        eVar.getClass();
        String str = this.f13689h0;
        AbstractC3557B.c0("fallbackDeviceId", str);
        MediaDrm mediaDrm2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!this.f13688Z) {
            A a5 = eVar.f13696h0;
            if (a5 != null) {
                String b10 = a5.b(3);
                if (b10 != null) {
                    return b10;
                }
                return str;
            }
            AbstractC3557B.C2("storage");
            throw null;
        }
        int i10 = Build.VERSION.SDK_INT;
        try {
            mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            try {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                AbstractC3557B.b0("wvDrm.getPropertyByteArr\u2026ROPERTY_DEVICE_UNIQUE_ID)", propertyByteArray);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(propertyByteArray);
                byte[] digest = messageDigest.digest();
                AbstractC3557B.b0("md.digest()", digest);
                str2 = kf.q.q3(digest, "", f.f13701Y, 30);
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT >= 28) {
                }
                if (str2 != null && str2.length() != 0) {
                    return str2;
                }
                return str;
            } catch (Throwable th3) {
                th2 = th3;
                mediaDrm2 = mediaDrm;
                if (Build.VERSION.SDK_INT >= 28) {
                    if (mediaDrm2 != null) {
                        mediaDrm2.release();
                    }
                } else if (mediaDrm2 != null) {
                    mediaDrm2.release();
                }
                throw th2;
            }
        } catch (Exception unused2) {
            mediaDrm = null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }
}

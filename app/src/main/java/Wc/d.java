package Wc;

import Df.H;
import Df.w;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Build;
import com.google.android.gms.internal.play_billing.N;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import he.C3418c;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C;
import l8.AbstractC4344b;
import me.T;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p1.AbstractC5040e;
import p1.AbstractC5042g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20901a;

    public /* synthetic */ d(int i10) {
        this.f20901a = i10;
    }

    public static HttpURLConnection b(String str) {
        AbstractC3557B.c0("url", str);
        try {
            URLConnection openConnection = new URL(str).openConnection();
            AbstractC3557B.a0("null cannot be cast to non-null type java.net.HttpURLConnection", openConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(201000);
            httpURLConnection.setRequestProperty(SIPHeaderNames.USER_AGENT, "analytics-kotlin/1.14.2");
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (MalformedURLException e10) {
            IOException iOException = new IOException("Attempted to use malformed url: ".concat(str), e10);
            AbstractC4344b.V0(Qd.i.Companion, iOException);
            throw iOException;
        }
    }

    public static void c(Context context, Yg.p pVar) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("startTime", pVar);
        Intent putExtra = new Intent(context, VoiceModeForegroundService.class).putExtra("start_time", pVar.c());
        AbstractC3557B.b0("putExtra(...)", putExtra);
        Object obj = AbstractC5042g.f41723a;
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC5040e.b(context, putExtra);
        } else {
            context.startService(putExtra);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: a | IllegalArgumentException -> 0x006d, TryCatch #0 {a | IllegalArgumentException -> 0x006d, blocks: (B:12:0x0027, B:16:0x0036, B:20:0x005b, B:22:0x0065, B:23:0x006c), top: B:25:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: a | IllegalArgumentException -> 0x006d, TryCatch #0 {a | IllegalArgumentException -> 0x006d, blocks: (B:12:0x0027, B:16:0x0036, B:20:0x005b, B:22:0x0065, B:23:0x006c), top: B:25:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(T t10, AbstractC4825e abstractC4825e) {
        c cVar;
        Object obj;
        int i10;
        try {
            if (abstractC4825e instanceof c) {
                cVar = (c) abstractC4825e;
                int i11 = cVar.f20900i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.f20900i0 = i11 - Integer.MIN_VALUE;
                    obj = cVar.f20898Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = cVar.f20900i0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            t10 = cVar.f20897Y;
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        C3418c b10 = t10.f39189Y.b();
                        w a5 = C.a(g.class);
                        Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(g.class), a5);
                        cVar.f20897Y = t10;
                        cVar.f20900i0 = 1;
                        obj = b10.a(n22, cVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    if (obj == null) {
                        return new b(((g) obj).f20904a, t10);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.openai.network.cloudflare.CloudflareGenericError.Detail");
                }
            }
            if (i10 == 0) {
            }
            if (obj == null) {
            }
        } catch (Ce.a | IllegalArgumentException unused) {
            return null;
        }
        cVar = new c(this, abstractC4825e);
        obj = cVar.f20898Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f20900i0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        this(0);
        this.f20901a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
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
                this(29);
                return;
        }
    }
}

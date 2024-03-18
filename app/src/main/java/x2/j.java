package x2;

import android.net.Uri;
import g3.AbstractC3161d;
import io.sentry.android.core.AbstractC3612c;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class j extends Thread {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48648Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f48649Z;

    public /* synthetic */ j(int i10, Object obj) {
        this.f48648Y = i10;
        this.f48649Z = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Throwable e10;
        int i10 = this.f48648Y;
        Object obj = this.f48649Z;
        switch (i10) {
            case 0:
                AbstractC3161d abstractC3161d = (AbstractC3161d) obj;
                abstractC3161d.getClass();
                do {
                    try {
                    } catch (InterruptedException e11) {
                        throw new IllegalStateException(e11);
                    }
                } while (abstractC3161d.f());
                return;
            case 1:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) obj;
                scheduledExecutorService.shutdown();
                try {
                    if (!((ScheduledExecutorService) obj).awaitTermination(5L, TimeUnit.SECONDS)) {
                        ((ScheduledExecutorService) obj).shutdownNow();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
            case 2:
                M6.d dVar = (M6.d) ((WeakReference) obj).get();
                if (dVar != null) {
                    dVar.close();
                    return;
                }
                return;
            case 3:
                Map map = (Map) obj;
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(uri);
                            AbstractC3612c.r("HttpUrlPinger", sb2.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                } catch (IOException e12) {
                    e10 = e12;
                    String message = e10.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                    sb3.append("Error while pinging URL: ");
                    sb3.append(uri);
                    sb3.append(". ");
                    sb3.append(message);
                    AbstractC3612c.s("HttpUrlPinger", sb3.toString(), e10);
                    return;
                } catch (IndexOutOfBoundsException e13) {
                    String message2 = e13.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(uri);
                    sb4.append(". ");
                    sb4.append(message2);
                    AbstractC3612c.s("HttpUrlPinger", sb4.toString(), e13);
                    return;
                } catch (RuntimeException e14) {
                    e10 = e14;
                    String message3 = e10.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
                    sb32.append("Error while pinging URL: ");
                    sb32.append(uri);
                    sb32.append(". ");
                    sb32.append(message3);
                    AbstractC3612c.s("HttpUrlPinger", sb32.toString(), e10);
                    return;
                } finally {
                }
            case 4:
                ((Rd.f) obj).b();
                return;
            default:
                FileOutputStream fileOutputStream = ((Vd.g) obj).f18600e;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(M6.d dVar) {
        super("dd-tracer-shutdown-hook");
        this.f48648Y = 2;
        this.f48649Z = new WeakReference(dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(M6.d dVar, int i10) {
        this(dVar);
        this.f48648Y = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AbstractC3161d abstractC3161d) {
        super("ExoPlayer:SimpleDecoder");
        this.f48648Y = 0;
        this.f48649Z = abstractC3161d;
    }

    public j(HashMap hashMap) {
        this.f48648Y = 3;
        this.f48649Z = hashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ScheduledExecutorService scheduledExecutorService) {
        super("dd-exec-shutdown-hook");
        this.f48648Y = 1;
        this.f48649Z = scheduledExecutorService;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ScheduledExecutorService scheduledExecutorService, int i10) {
        this(scheduledExecutorService);
        this.f48648Y = 1;
    }
}

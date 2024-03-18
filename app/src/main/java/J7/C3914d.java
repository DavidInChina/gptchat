package j7;

import M3.H;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import n7.AbstractC4720a;

/* renamed from: j7.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3914d implements AbstractC3923m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f36037a;

    /* renamed from: b  reason: collision with root package name */
    public final k7.d f36038b;

    /* renamed from: c  reason: collision with root package name */
    public final C3912b f36039c;

    public C3914d(Context context, k7.d dVar, C3912b c3912b) {
        this.f36037a = context;
        this.f36038b = dVar;
        this.f36039c = c3912b;
    }

    public final void a(e7.i iVar, int i10, boolean z10) {
        boolean z11;
        Context context = this.f36037a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f29006a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        b7.c cVar = iVar.f29008c;
        adler32.update(allocate.putInt(AbstractC4720a.a(cVar)).array());
        byte[] bArr = iVar.f29007b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        H.M("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a5 = ((k7.k) this.f36038b).a();
        String valueOf = String.valueOf(AbstractC4720a.a(cVar));
        String str = iVar.f29006a;
        Long l10 = (Long) k7.k.p(a5.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf}), new A9.a(10));
        long longValue = l10.longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        C3912b c3912b = this.f36039c;
        builder.setMinimumLatency(c3912b.a(cVar, longValue, i10));
        Set set = ((C3913c) c3912b.f36033b.get(cVar)).f36036c;
        if (set.contains(EnumC3915e.f36040Y)) {
            builder.setRequiredNetworkType(2);
            z11 = true;
        } else {
            z11 = true;
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC3915e.f36042h0)) {
            builder.setRequiresCharging(z11);
        }
        if (set.contains(EnumC3915e.f36041Z)) {
            builder.setRequiresDeviceIdle(z11);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", AbstractC4720a.a(cVar));
        if (bArr != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(c3912b.a(cVar, longValue, i10)), l10, Integer.valueOf(i10)};
        String W6 = H.W("JobInfoScheduler");
        if (Log.isLoggable(W6, 3)) {
            Log.d(W6, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}

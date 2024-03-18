package com.datadog.android.core.internal.data.upload;

import A5.u;
import L3.p;
import P4.a;
import Q5.c;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kf.t;
import kotlin.Metadata;
import o5.AbstractC4918b;
import p5.AbstractC5092d;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import u5.g;
import u5.j;
import y5.h;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "k5/F", "A5/u", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes.dex */
public final class UploadWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC3557B.c0("appContext", context);
        AbstractC3557B.c0("workerParams", workerParameters);
    }

    @Override // androidx.work.Worker
    public final p f() {
        String str;
        g gVar;
        h hVar;
        Object obj = this.f10726Z.f25520b.f10715a.get("_dd.sdk.instanceName");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        AbstractC5092d a5 = AbstractC4918b.a(str);
        if (a5 instanceof g) {
            gVar = (g) a5;
        } else {
            gVar = null;
        }
        if (gVar != null && !(gVar instanceof j)) {
            List<AbstractC5368c> c10 = gVar.c();
            ArrayList arrayList = new ArrayList();
            for (AbstractC5368c abstractC5368c : c10) {
                if (abstractC5368c instanceof h) {
                    hVar = (h) abstractC5368c;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                }
            }
            List N22 = t.N2(arrayList);
            Collections.shuffle(N22);
            LinkedList linkedList = new LinkedList();
            Iterator it = ((ArrayList) N22).iterator();
            while (it.hasNext()) {
                linkedList.offer(new u(linkedList, gVar, (h) it.next()));
            }
            while (!linkedList.isEmpty()) {
                u uVar = (u) linkedList.poll();
                if (uVar != null) {
                    uVar.run();
                }
            }
            return new p(L3.g.f10714c);
        }
        a.m0(c.f14433a, 5, EnumC5090b.f42738Y, A5.a.f658k0, null, false, 56);
        return new p(L3.g.f10714c);
    }
}

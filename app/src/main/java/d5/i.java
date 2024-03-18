package d5;

import android.gov.nist.core.Separators;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import f5.C2937a;
import java.util.ArrayList;
import java.util.Arrays;
import nf.AbstractC4828h;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i extends AbstractC4828h implements g {
    @Override // d5.g
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        C2937a.d("SoftwareInformation", "Collecting signals", new Throwable[0]);
        arrayList.add(new f("mobile_sdk__os_version", Build.VERSION.RELEASE));
        arrayList.add(new f("mobile_sdk__os_sdk_version", Integer.valueOf(Build.VERSION.SDK_INT)));
        AbstractC4828h.n(arrayList, "mobile_sdk__kernel", new c(this) { // from class: d5.h

            /* renamed from: Z  reason: collision with root package name */
            public final /* synthetic */ i f28004Z;

            {
                this.f28004Z = this;
            }

            @Override // d5.c
            public final Object a() {
                int i10 = r2;
                this.f28004Z.getClass();
                switch (i10) {
                    case 0:
                        return System.getProperty("os.version", "");
                    case 1:
                        return new ArrayList(Arrays.asList(Build.TAGS.split(Separators.COMMA)));
                    default:
                        JSONArray jSONArray = new JSONArray();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(Arrays.asList(new MediaCodecList(1).getCodecInfos()));
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) arrayList2.get(i11);
                            JSONObject jSONObject = new JSONObject();
                            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                            jSONObject.put("name", mediaCodecInfo.getName());
                            for (String str : supportedTypes) {
                                jSONObject.put("supportedTypes", str);
                            }
                            jSONArray.put(jSONObject);
                        }
                        C2937a.d("SoftwareInformation", "Codec: " + jSONArray.toString(), new Throwable[0]);
                        return AbstractC4828h.m(jSONArray.toString());
                }
            }
        });
        arrayList.add(new f("mobile_sdk__bootloader", Build.BOOTLOADER));
        AbstractC4828h.n(arrayList, "mobile_sdk__os_build_tags", new c(this) { // from class: d5.h

            /* renamed from: Z  reason: collision with root package name */
            public final /* synthetic */ i f28004Z;

            {
                this.f28004Z = this;
            }

            @Override // d5.c
            public final Object a() {
                int i10 = r2;
                this.f28004Z.getClass();
                switch (i10) {
                    case 0:
                        return System.getProperty("os.version", "");
                    case 1:
                        return new ArrayList(Arrays.asList(Build.TAGS.split(Separators.COMMA)));
                    default:
                        JSONArray jSONArray = new JSONArray();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(Arrays.asList(new MediaCodecList(1).getCodecInfos()));
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) arrayList2.get(i11);
                            JSONObject jSONObject = new JSONObject();
                            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                            jSONObject.put("name", mediaCodecInfo.getName());
                            for (String str : supportedTypes) {
                                jSONObject.put("supportedTypes", str);
                            }
                            jSONArray.put(jSONObject);
                        }
                        C2937a.d("SoftwareInformation", "Codec: " + jSONArray.toString(), new Throwable[0]);
                        return AbstractC4828h.m(jSONArray.toString());
                }
            }
        });
        arrayList.add(new f("mobile_sdk__os_build_type", Build.TYPE));
        AbstractC4828h.n(arrayList, "mobile_sdk__codec_hash", new c(this) { // from class: d5.h

            /* renamed from: Z  reason: collision with root package name */
            public final /* synthetic */ i f28004Z;

            {
                this.f28004Z = this;
            }

            @Override // d5.c
            public final Object a() {
                int i10 = r2;
                this.f28004Z.getClass();
                switch (i10) {
                    case 0:
                        return System.getProperty("os.version", "");
                    case 1:
                        return new ArrayList(Arrays.asList(Build.TAGS.split(Separators.COMMA)));
                    default:
                        JSONArray jSONArray = new JSONArray();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(Arrays.asList(new MediaCodecList(1).getCodecInfos()));
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) arrayList2.get(i11);
                            JSONObject jSONObject = new JSONObject();
                            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                            jSONObject.put("name", mediaCodecInfo.getName());
                            for (String str : supportedTypes) {
                                jSONObject.put("supportedTypes", str);
                            }
                            jSONArray.put(jSONObject);
                        }
                        C2937a.d("SoftwareInformation", "Codec: " + jSONArray.toString(), new Throwable[0]);
                        return AbstractC4828h.m(jSONArray.toString());
                }
            }
        });
        return arrayList;
    }
}

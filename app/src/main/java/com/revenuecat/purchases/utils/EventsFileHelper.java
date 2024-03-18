package com.revenuecat.purchases.utils;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.utils.Event;
import id.AbstractC3557B;
import j$.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import wf.k;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u00a2\u0006\u0004\b \u0010!J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u00a8\u0006\""}, d2 = {"Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/utils/Event;", TokenNames.T, "", "", "string", "mapToEvent", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;", "event", "Ljf/y;", "appendEvent", "(Lcom/revenuecat/purchases/utils/Event;)V", "Lkotlin/Function1;", "j$/util/stream/Stream", "streamBlock", "readFile", "(Lwf/k;)V", "Lorg/json/JSONObject;", "readFileAsJson", "", "eventsToDeleteCount", SDPKeywords.CLEAR, "(I)V", "deleteFile", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "Lcom/revenuecat/purchases/common/FileHelper;", "filePath", "Ljava/lang/String;", "eventDeserializer", "Lwf/k;", "<init>", "(Lcom/revenuecat/purchases/common/FileHelper;Ljava/lang/String;Lwf/k;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class EventsFileHelper<T extends Event> {
    private final k eventDeserializer;
    private final FileHelper fileHelper;
    private final String filePath;

    public EventsFileHelper(FileHelper fileHelper, String str, k kVar) {
        AbstractC3557B.c0("fileHelper", fileHelper);
        AbstractC3557B.c0("filePath", str);
        this.fileHelper = fileHelper;
        this.filePath = str;
        this.eventDeserializer = kVar;
    }

    public static final /* synthetic */ Event access$mapToEvent(EventsFileHelper eventsFileHelper, String str) {
        return eventsFileHelper.mapToEvent(str);
    }

    public final T mapToEvent(String str) {
        k kVar = this.eventDeserializer;
        if (kVar == null) {
            return null;
        }
        try {
            return (T) kVar.invoke(str);
        } catch (SerializationException e10) {
            LogUtilsKt.errorLog("Error parsing event from file: " + str, e10);
            return null;
        } catch (IllegalArgumentException e11) {
            LogUtilsKt.errorLog("Error parsing event from file: " + str, e11);
            return null;
        }
    }

    public final synchronized void appendEvent(T t10) {
        AbstractC3557B.c0("event", t10);
        FileHelper fileHelper = this.fileHelper;
        String str = this.filePath;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t10);
        sb2.append('\n');
        fileHelper.appendToFile(str, sb2.toString());
    }

    public final synchronized void clear(int i10) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, i10);
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogUtilsKt.verboseLog("Failed to delete events file in " + this.filePath + '.');
        }
    }

    public final synchronized void readFile(k kVar) {
        try {
            AbstractC3557B.c0("streamBlock", kVar);
            if (this.eventDeserializer != null && !this.fileHelper.fileIsEmpty(this.filePath)) {
                this.fileHelper.readFilePerLines(this.filePath, new EventsFileHelper$readFile$1(kVar, this));
            }
            Stream empty = Stream.CC.empty();
            AbstractC3557B.b0("empty()", empty);
            kVar.invoke(empty);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void readFileAsJson(k kVar) {
        try {
            AbstractC3557B.c0("streamBlock", kVar);
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                Stream empty = Stream.CC.empty();
                AbstractC3557B.b0("empty()", empty);
                kVar.invoke(empty);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new EventsFileHelper$readFileAsJson$1(kVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public /* synthetic */ EventsFileHelper(FileHelper fileHelper, String str, k kVar, int i10, g gVar) {
        this(fileHelper, str, (i10 & 4) != 0 ? null : kVar);
    }
}

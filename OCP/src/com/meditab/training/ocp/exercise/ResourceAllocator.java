package com.meditab.training.ocp.exercise;

public class ResourceAllocator
{
   interface resource()
   {
	   void allocate(ResourceType resourceType);
	   void free(ResourceType resourceType, int resourceId);
   }

 
}
